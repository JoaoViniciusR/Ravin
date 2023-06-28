package Controladores;

import Modelos.Funcionario;
import Repositorios.FuncionarioRepository;

//Nesta classe, devem-se colocar todas as regras de negócio de Funcionário
public class FuncionarioController {
    private FuncionarioRepository repository;

    public FuncionarioController() {
        repository = new FuncionarioRepository();
    }

    public void cadastrar(Funcionario entidade){
        //Regras de negócio

        repository.salvar(entidade);
    }

}
