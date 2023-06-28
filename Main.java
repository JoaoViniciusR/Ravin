
//import java.security.Timestamp;
import Enumeradores.*;
import Modelos.*;
import Utilidades.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean executando = true;
        int opcaoSelecionado = 0;

        for(;executando;) {
            opcaoSelecionado = Integer.parseInt(JOptionPane.showInputDialog(montarMenuPrincipal()));

            switch (opcaoSelecionado){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    executando = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida");
                    break;
            }
        }
    }

    public static Pessoa cadastrarPessoa() {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id pessoa"));
        String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
        String endereco = JOptionPane.showInputDialog("Digite o endereço da pessoa");
        String telefone = JOptionPane.showInputDialog("Digite o telefone da pessoa");
        String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
        Date dataNascimento = DateUtils.stringToDate(
                JOptionPane.showInputDialog("Qual a data de nascimento da pessoa? \n Formato: dd/MM/yyyy"));
        EstadoCivil estadoCivil = (EstadoCivil.values()[Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o estado civíl do funcionario: \n [1 - Solteiro \n 2 - Casado \n 3 - Viúvo \n 4 - Divorciado \n 5 - Separado]"))]);
        String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
        boolean ativo = Boolean
                .parseBoolean(JOptionPane.showInputDialog("O usuário está ativo? \n[1 - Sim \n 0 - Não]"));

        return new Pessoa(id, nome, endereco, telefone, dataNascimento, cpf, estadoCivil, observacao, ativo);
    }

    public static Funcionario cadastrarFuncionario(){
        Pessoa pessoa = new Pessoa();

        Funcionario funcionario = new Funcionario();

        funcionario.setEscolaridade(Escolaridade.values()[Integer.parseInt(JOptionPane.showInputDialog("0- Ensino Fundamental /n 1- Ensino médio /n 2- Ensino Superior"))]);
        funcionario.setCargo(Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog(""))]);
        return funcionario;
    }

    public static Cliente cadastrarCliente() {
        Cliente cliente = new Cliente();

        cliente.setAlergia(JOptionPane.showInputDialog("Digite a sua alergia"));
        cliente.setVip(false);

        return cliente;
    }

    public static Mesa cadastrarMesa() {
        Mesa mesa = new Mesa();

        mesa.setNome(JOptionPane.showInputDialog("Digite o nome da mesa"));
        mesa.setCodigo(JOptionPane.showInputDialog("Digite o código"));
        mesa.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa")));
        mesa.setStatusMesa(StatusMesa.ABERTA);

        return mesa;
    }

    public static Comanda cadastrarComanda() { 
        Comanda comanda = new Comanda();

        comanda.setStatusComanda(StatusComanda.ABERTA);
        comanda.setCodigo(JOptionPane.showInputDialog("Digite o código"));
        comanda.setObservacao(JOptionPane.showInputDialog("Digite alguma observação"));

        return comanda;
    }

    public static Cardapio cadastrarCardapio() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String descricao = JOptionPane.showInputDialog("Digite a descrição");
        List<Produto> listaProdutosCardapio = new ArrayList<>();
        String codigo = JOptionPane.showInputDialog("Digite o código");
        CategoriaCardapio categoria = CategoriaCardapio.LANCHES;
        boolean status = true;

        Cardapio cardapio = new Cardapio(id, nome, descricao, listaProdutosCardapio, codigo, categoria, status);

        return cardapio;
    }

    public static Produto cadastrarProduto() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        String nome = JOptionPane.showInputDialog("Digite o nome do produto");
        String descricao = JOptionPane.showInputDialog("Digite a descrição");
        String codigo = JOptionPane.showInputDialog("Digite o código");
        float precoCusto = Float.valueOf(JOptionPane.showInputDialog("Digigite o custo"));
        float precoVenda = Float.valueOf(JOptionPane.showInputDialog("Digite o valor de venda"));
        Timestamp tempoPreparo = Timestamp.valueOf(JOptionPane.showInputDialog("Digite o tempo de preparo"));
        String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
        TipoProduto tipoProduto = TipoProduto.BEBIDA;
        StatusProduto statusProduto = StatusProduto.ATIVO;

        Produto produto = new Produto(id, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacao, tipoProduto, statusProduto);


        return produto;
    }

    public static Pedido cadastrarPedido() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        Produto produto = new Produto();
        Timestamp dataHoraSolicitado = Timestamp.valueOf(JOptionPane.showInputDialog("Digite a hora que foi solicitado o pedido"));
        Timestamp dataHoraInicioPreparo = Timestamp.valueOf(JOptionPane.showInputDialog("Digite a hora de início de preparo"));
        Timestamp tempoPreparoRestante = Timestamp.valueOf(JOptionPane.showInputDialog("Digite o tempo de preparo restante"));
        int quantidade = Integer.valueOf(JOptionPane.showInputDialog("Digite a quantidade do produto"));
        StatusPreparo statusPreparo = StatusPreparo.PREPARANDO;
        String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");

        Pedido pedido = new Pedido(id, produto, dataHoraSolicitado, dataHoraInicioPreparo, tempoPreparoRestante, quantidade, statusPreparo, observacao);
        
        return pedido;
    }

    public static String montarMenuPrincipal() {
        StringBuilder sb = new StringBuilder();
        sb.append("=-=-=-=-=-=-=-=-=-=-=-= RAVIN =-=-=-=-=-=-=-=-=-=-=-= /n");
        sb.append("1- Funcionário ");
        sb.append("2- Cliente/n");
        sb.append("3- Produto/n");
        sb.append("4- Cardápio/n");
        sb.append("5- Mesa/n");
        sb.append("6- Pedido/n");
        sb.append("7- Sair");

        return sb.toString();
    }

    public static String montarSubMenuGeral(String modulo) {
        StringBuilder st = new StringBuilder();
        st.append("================= Gestão de ");
        st.append(modulo);
        st.append("================== /n");
        st.append("1- Cadastrar /n");
        st.append("2- Alterar/n");
        st.append("3- Excluir/n");
        st.append("4- Consultar/n");
        st.append("5- Listar todos/n");
        st.append("6- Voltar");

        return st.toString();
    }

}
