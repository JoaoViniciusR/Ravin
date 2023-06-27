package Modelos;//import java.security.Timestamp;
import java.sql.Timestamp;
import java.sql.Date;
import Enumeradores.*;


public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String codigo;
    private float precoCusto;
    private float precoVenda;
    private Timestamp tempoPreparo;
    private String observacao;
    private TipoProduto tipoProduto;
    private StatusProduto status;

    public Produto(int id, String nome, String descricao, String codigo, float precoCusto, float precoVenda, Timestamp tempoPreparo, String observacao, TipoProduto tipoProduto, StatusProduto status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.tempoPreparo = tempoPreparo;
        this.observacao = observacao;
        this.tipoProduto = tipoProduto;
        this.status = status;
    }
    public Produto(){}

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public StatusProduto getStatus() {
        return status;
    }

    public void setStatus(StatusProduto status) {
        this.status = status;
    }
}
