import java.util.List;

public class Comanda {
    private int id;
    private Mesa mesa;
    private Cliente cliente;
    private List<Pedido> produtosPedidos;
    private StatusComanda statusComanda;
    private String codigo;
    private float valorTotal;

    public Comanda(int id, Mesa mesa, Cliente cliente, List<Pedido> produtosPedidos, StatusComanda statusComanda, String codigo, float valorTotal) {
        this.id = id;
        this.mesa = mesa;
        this.cliente = cliente;
        this.produtosPedidos = produtosPedidos;
        this.statusComanda = statusComanda;
        this.codigo = codigo;
        this.valorTotal = valorTotal;
    }
    public Comanda() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Pedido> getProdutosPedidos() {
        return produtosPedidos;
    }

    public void setProdutosPedidos(List<Pedido> produtosPedidos) {
        this.produtosPedidos = produtosPedidos;
    }

    public StatusComanda getStatusComanda() {
        return statusComanda;
    }

    public void setStatusComanda(StatusComanda statusComanda) {
        this.statusComanda = statusComanda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void adicionarPedido(Pedido produto) {
        produtosPedidos.add(produto);
        calcularTotalPagar();
    }

    public void removerPedido(String codigo) {
        produtosPedidos.remove(codigo);
        calcularTotalPagar();
    }

    public boolean fecharComanda() {
        if (produtosPedidos.isEmpty()) {
            return false;
        }

        statusComanda = StatusComanda.FECHADA;
        return true;
    }

    public float calcularTotalPagar() {
        float total = 0.0f;
        for (Pedido produto : produtosPedidos) {
            total += produto.getProduto().getPrecoVenda() * produto.getQuantidade();
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
