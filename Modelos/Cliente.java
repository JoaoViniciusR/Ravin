package Modelos;

import Modelos.Pessoa;
import Enumeradores.EstadoCivil;

import java.util.Date;

public class Cliente extends Pessoa {

    private String alergia;
    private boolean vip;

    public Cliente(int id, String nome, String endereco, String telefone, Date dataNascimento, String cpf, EstadoCivil estadoCivil, String observacao, boolean status, String alergia, boolean vip) {
        super(id, nome, endereco, telefone, dataNascimento, cpf, estadoCivil, observacao, status);
        this.alergia = alergia;
        this.vip = vip;
    }

    public Cliente() {}

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean eAniversario () {
        return true;
    }
}
