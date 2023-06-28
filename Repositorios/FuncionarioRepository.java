package Repositorios;

import Modelos.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {

    private List<Funcionario> funcionarios;

    public FuncionarioRepository() {
        funcionarios = new ArrayList<>();
    }

    public void salvar(Funcionario entidade){
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == entidade.getId()){
                funcionario = entidade;
            }
        }
    }

    public List<Funcionario> listarTodos() {
        return funcionarios;
    }

    public void excluir(Funcionario entidade) {
        funcionarios.remove(entidade);
    }

    public Funcionario buscarProIdFuncionario(int id) {
        Funcionario funcionarioBuscado = null;
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == id){
                funcionarioBuscado = funcionario;
            }
        }
        return funcionarioBuscado;
    }

    public void deletarPeloId(int id) {
        Funcionario funcionarioBuscado = null;
        for(Funcionario funcionario : funcionarios) {
            if(funcionario.getId() == id){
                funcionarioBuscado = funcionario;
            }
        }
        funcionarios.remove(funcionarioBuscado);
    }
}
