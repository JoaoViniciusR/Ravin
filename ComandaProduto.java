public class ComandaProduto {

    private int id;
    private Produto produto;
    private int quantidadeProduto;
    private String statusPreparo;

    public ComandaProduto(int id, Produto produto, int quantidadeProduto, String statusPreparo) {
        this.id = id;
        this.produto = produto;
        this.quantidadeProduto = quantidadeProduto;
        this.statusPreparo = statusPreparo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getStatusPreparo() {
        return statusPreparo;
    }

    public void setStatusPreparo(String statusPreparo) {
        this.statusPreparo = statusPreparo;
    }
    
}
