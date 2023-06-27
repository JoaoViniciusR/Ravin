
//import java.security.Timestamp;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa p = cadastrarPessoa();
        Funcionario f = cadastrarFuncionario();
        Cliente c = cadastrarCliente();
        Mesa m = cadastrarMesa();
        Comanda cn = cadastrarComanda();
        Cardapio cardapio = cadastrarCardapio();
        Produto pr = cadastrarProduto();
        Pedido pedido = cadastrarPedido();

        
    }

    public static Pessoa cadastrarPessoa() {
       int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
       String nome = JOptionPane.showInputDialog("Digite o nome da pessoa");
       String telefone = JOptionPane.showInputDialog("Digite o telefone");
       String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
       String rg = JOptionPane.showInputDialog("Digite o rg");
       String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
       EstadoCivil estadoCivil = EstadoCivil.SOLTEIRO;
       String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
       boolean ativo = true;

      
       Pessoa pessoa =  new Pessoa(id, nome, telefone, dataNascimento, cpf, rg,  estadoCivil, observacao, ativo);

       return pessoa;
    }

    public static Funcionario cadastrarFuncionario(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
        String rg = JOptionPane.showInputDialog("Digite o rg");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        EstadoCivil estadoCivil = EstadoCivil.SOLTEIRO;
        String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
        Escolaridade escolaridade = Escolaridade.ENSINO_SUPERIOR;
        Cargo cargo = Cargo.FAXINEIRO;
        String numCartT = JOptionPane.showInputDialog("Digite o número de sua carteira de trabalho");
        String dataAdm = JOptionPane.showInputDialog("Digite a data de admissão");
        String dataDem = JOptionPane.showInputDialog("Digite a data de demissão");
        Disponibilidade disponibilidade = Disponibilidade.DISPONIVEL;

        Funcionario funcionario = new Funcionario(id, nome, telefone, dataNascimento, cpf, rg, estadoCivil, observacao, true, escolaridade, cargo, numCartT, dataAdm, dataDem, disponibilidade);

        
        return funcionario;
    }

    public static Cliente cadastrarCliente() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String cpf = JOptionPane.showInputDialog("Digite o CPF da pessoa");
        String rg = JOptionPane.showInputDialog("Digite o rg");
        String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento");
        EstadoCivil estadoCivil = EstadoCivil.SOLTEIRO;
        String observacao = JOptionPane.showInputDialog("Digite alguma possível observação");
        boolean ativo = true;
        String alergia = JOptionPane.showInputDialog("Digite a sua alergia");
        Boolean vip = true;

        Cliente cliente = new Cliente(id, nome, telefone, cpf, rg, dataNascimento, estadoCivil, observacao, ativo, alergia, vip);

        return cliente;
    }

    public static Mesa cadastrarMesa() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        Funcionario funcionario = new Funcionario();
        String nome = JOptionPane.showInputDialog("Digite o nome da mesa");
        String codigo = JOptionPane.showInputDialog("Digite o código");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da mesa"));
        StatusMesa statusMesa = StatusMesa.ABERTA;
        int quantidadeMaxima  = Integer.parseInt(JOptionPane.showInputDialog("Digite o quantidade máxima para a mesa"));
        List<Comanda> comandas = new ArrayList<>();
        Comanda comandado = new Comanda();
        comandas.add(comandado);

        Mesa mesa = new Mesa(id, funcionario, nome, codigo, numero, statusMesa, quantidadeMaxima, comandas);

        return mesa;
    }

    public static Comanda cadastrarComanda() { 
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite um id"));
        Mesa mesa = new Mesa();
        Cliente cliente = new Cliente();
        List<Pedido> produtosPedidos = new ArrayList<>();
        StatusComanda statusComanda = StatusComanda.ABERTA;
        String codigo = JOptionPane.showInputDialog("Digite o código");
        float valorTotal = Float.valueOf(JOptionPane.showInputDialog("Digite o valor total"));

        Comanda comanda = new Comanda(id, mesa, cliente, produtosPedidos, statusComanda, codigo, valorTotal);
        
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

}
