import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private int id;
    private String nome;
    private List<Produto> listaProdutosCardapio;
    private String codigo;
    private boolean status;

    public Cardapio(int id, String nome, String codigo, boolean status) {
        this.id = id;
        this.nome = nome;
        this.listaProdutosCardapio = new ArrayList<>();
        this.codigo = codigo;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getListaProdutosCardapio() {
        return listaProdutosCardapio;
    }

    public void setListaProdutosCardapio(List<Produto> listaProdutosCardapio) {
        this.listaProdutosCardapio = listaProdutosCardapio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void adicionarProduto(Produto produto) {
        listaProdutosCardapio.add(produto);
    }

    public void deletarProduto(Produto produto) {
        listaProdutosCardapio.remove(produto);
    }
}
