import java.sql.Date;

public class Funcionario extends Pessoa{

    private Escolaridade escolaridade;
    private Cargo cargo;
    private String numeroCarteiraT;
    private Date dataAdmissao;
    private Date dataDemissao;
    private Disponibilidade disponibilidade;

    public Funcionario(int id, String nome, String telefone, Date dataNascimento, String cpf, String rg, EstadoCivil estadoCivil, String observacao, boolean status, Escolaridade escolaridade, Cargo cargo, String numeroCarteiraT, Date dataAdmissao, Date dataDemissao, Disponibilidade disponibilidade) {
        super(id, nome, telefone, dataNascimento, cpf, rg, estadoCivil, observacao, status);
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.numeroCarteiraT = numeroCarteiraT;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.disponibilidade = disponibilidade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getNumeroCarteiraT() {
        return numeroCarteiraT;
    }

    public void setNumeroCarteiraT(String numeroCarteiraT) {
        this.numeroCarteiraT = numeroCarteiraT;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
