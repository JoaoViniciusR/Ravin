import java.sql.Timestamp;

public class Pedido {

    private int id;
    private Produto produto;
    private Timestamp dataHoraSolicitado;
    private Timestamp dataHoraInicioPreparo;
    private Timestamp tempoPreparoRestante;
    private int quantidade;
    private StatusPreparo statusPreparo;
    private String observacao;

    public Pedido(int id, Produto produto, Timestamp dataHoraSolicitado, Timestamp dataHoraInicioPreparo, Timestamp tempoPreparoRestante, int quantidade, StatusPreparo statusPreparo, String observacao) {
        this.id = id;
        this.produto = produto;
        this.dataHoraSolicitado = dataHoraSolicitado;
        this.dataHoraInicioPreparo = dataHoraInicioPreparo;
        this.tempoPreparoRestante = tempoPreparoRestante;
        this.quantidade = quantidade;
        this.statusPreparo = statusPreparo;
        this.observacao = observacao;
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

    public Timestamp getDataHoraSolicitado() {
        return dataHoraSolicitado;
    }

    public void setDataHoraSolicitado(Timestamp dataHoraSolicitado) {
        this.dataHoraSolicitado = dataHoraSolicitado;
    }

    public Timestamp getDataHoraInicioPreparo() {
        return dataHoraInicioPreparo;
    }

    public void setDataHoraInicioPreparo(Timestamp dataHoraInicioPreparo) {
        this.dataHoraInicioPreparo = dataHoraInicioPreparo;
    }

    public Timestamp getTempoPreparoRestante() {
        return tempoPreparoRestante;
    }

    public void setTempoPreparoRestante(Timestamp tempoPreparoRestante) {
        this.tempoPreparoRestante = tempoPreparoRestante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public StatusPreparo getStatusPreparo() {
        return statusPreparo;
    }

    public void setStatusPreparo(StatusPreparo statusPreparo) {
        this.statusPreparo = statusPreparo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void adicionarQuantidade(int quantidade){

    }
}
