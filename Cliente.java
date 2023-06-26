import java.util.Calendar;
import java.util.Date;

public class Cliente extends Pessoa {

    private String endereco;
    private String observacao;

    public Cliente(int id, String nome, String telefone, java.sql.Date dataNascimento, String cpf, String rg, String estadoCivil, boolean status, String endereco, String observacao) {
        super(id, nome, telefone, dataNascimento, cpf, rg, estadoCivil, status);
        this.endereco = endereco;
        this.observacao = observacao;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean eAniversario() {

        Calendar calendarAtual = Calendar.getInstance();
        Calendar calendarNascimento = Calendar.getInstance();

        calendarAtual.setTime(new Date());

        calendarNascimento.setTime(getDataNascimento());


        if (calendarNascimento.get(Calendar.MONTH) == calendarAtual.get(Calendar.MONTH)
                && calendarNascimento.get(Calendar.DAY_OF_MONTH) == calendarAtual.get(Calendar.DAY_OF_MONTH)) {
            return true;
        }

        return false;
    }
}
