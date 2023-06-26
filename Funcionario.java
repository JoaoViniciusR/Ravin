import java.sql.Date;

public class Funcionario extends Pessoa{

    private String escolaridade;
    private String cargo;
    private String numeroCarteiraT;
    private Date dataAdmissao;
    private Date dataDemissao;
    
    public Funcionario(int id, String nome, String telefone, Date dataNascimento, String cpf, String rg, String estadoCivil, boolean status, String escolaridade, String cargo, String numeroCarteira, Date dataAdmissao, Date dataDemisssao) {
        super(id, nome, telefone, dataNascimento, cpf, rg, estadoCivil, status);
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.numeroCarteiraT = numeroCarteira;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemisssao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumeroCarteiraTrabalho() {
        return numeroCarteiraT;
    }

    public void setNumeroCarteiraTrabalho(String numeroCarteiraTrabalho) {
        this.numeroCarteiraT = numeroCarteiraTrabalho;
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
}
