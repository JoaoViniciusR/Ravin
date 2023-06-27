import java.sql.Date;

public class Cliente extends Pessoa {

    private String alergia;
    private boolean vip;

    public Cliente(int id, String nome, String telefone, String dataNascimento, String cpf, String rg, EstadoCivil estadoCivil, String observacao, boolean status, String alergia, boolean vip) {
        super(id, nome, telefone, dataNascimento, cpf, rg, estadoCivil, observacao, status);
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
