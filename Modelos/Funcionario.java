package Modelos;

import Enumeradores.*;

import java.util.Date;

public class Funcionario extends Pessoa {

    private Escolaridade escolaridade;
    private Cargo cargo;
    private String numeroCarteiraT;
    private String dataAdmissao;
    private String dataDemissao;
    private Disponibilidade disponibilidade;

    public Funcionario(int id, String nome, String endereco, String telefone, Date dataNascimento, String cpf, EstadoCivil estadoCivil, String observacao, boolean status, Escolaridade escolaridade, Cargo cargo, String numeroCarteiraT, String dataAdmissao, String dataDemissao, Disponibilidade disponibilidade) {
        super(id, nome, endereco, telefone, dataNascimento, cpf, estadoCivil, observacao, status);
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.numeroCarteiraT = numeroCarteiraT;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
        this.disponibilidade = disponibilidade;
    }

    public Funcionario(){}

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

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
