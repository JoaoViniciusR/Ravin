package Modelos;

import Enumeradores.EstadoCivil;

import java.util.Date;

public class Pessoa{

    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private Date dataNascimento;
    private String cpf;
    private EstadoCivil estadoCivil;
    private String observacao;
    private boolean status;


    public Pessoa(int id, String nome,String endereco, String telefone, Date dataNascimento, String cpf, EstadoCivil estadoCivil, String observacao, boolean status) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.observacao = observacao;
        this.status = status;
    }
    public Pessoa(){}

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
}