import java.util.ArrayList;
import java.util.List;

public class Comanda {
    private int id;
    private Mesa mesa;
    private Cliente cliente;
    private List<ComandaProduto> listaProdutos;
    private String statusComanda;
    private String codigoComanda; 
    private float valorTotal;

    public Comanda(int id, Mesa mesa, Cliente cliente, String codigoComanda) {
        this.id = id;
        this.mesa = mesa;
        this.cliente = cliente;
        this.listaProdutos = new ArrayList<>();
        this.statusComanda = "EM ABERTO";
        this.codigoComanda = codigoComanda;
        this.valorTotal = 0.0f;
    }
    public Comanda(){}

    public int getId() {
        return id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ComandaProduto> getListaProdutos() {
        return listaProdutos;
    }

    public String getStatusComanda() {
        return statusComanda;
    }

    public void setStatusComanda(String statusComanda) {
        this.statusComanda = statusComanda;
    }

    public String getCodigoComanda() {
        return codigoComanda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void adicionarProduto(ComandaProduto produto) {
        listaProdutos.add(produto);
        calcularTotalPagar();
    }

    public void removerProduto(ComandaProduto produto) {
        listaProdutos.remove(produto);
        calcularTotalPagar();
    }

    public boolean fecharComanda() {
        if (listaProdutos.isEmpty()) {
            return false;
        }

        statusComanda = "FECHADA";
        return true;
    }

    public float calcularTotalPagar() {
        float total = 0.0f;
        for (ComandaProduto produto : listaProdutos) {
            total += produto.getProduto().getPrecoVenda() * produto.getQuantidadeProduto();
        }

        if (cliente.eAniversario()) {
            total = adicionarDesconto(total, 10);
        }

        valorTotal = total;
        return total;
    }

    public float adicionarDesconto(float valor, int porcDesconto) {
        float desconto = (valor * porcDesconto) / 100;
        return valor - desconto;
    }
}
