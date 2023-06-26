import java.security.Timestamp;
import java.sql.Date;

public class Produto {
    private int id;
    private String nome;
    private String codigo;
    private float precoCusto;
    private float precoVenda;
    private Timestamp tempoPreparo;
    private String observacao;
    private boolean status;

    
    public Produto(int id, String nome, String codigo, float precoCusto, float precoVenda, Timestamp tempoPreparo, String observacao, boolean status) {
        this.id = id;
        this.nome = nome;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tempoPreparo = tempoPreparo;
        this.observacao = observacao;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Timestamp getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(Timestamp tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
