import java.util.List;

public class Mesa {
    private int id;
    private Funcionario funcionario;
    private String nome;
    private String codigo;
    private int numero; 
    private StatusMesa statusMesa;
    private int quantidadeMaxima;
    private List<Comanda> comandas;

    public Mesa(int id, Funcionario funcionario, String nome, String codigo, int numero, StatusMesa statusMesa, int quantidadeMaxima, List<Comanda> comandas) {
        this.id = id;
        this.funcionario = funcionario;
        this.nome = nome;
        this.codigo = codigo;
        this.numero = numero;
        this.statusMesa = statusMesa;
        this.quantidadeMaxima = quantidadeMaxima;
        this.comandas = comandas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public StatusMesa getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(StatusMesa statusMesa) {
        this.statusMesa = statusMesa;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    public void adicionarCliente(Cliente cliente) {
        //if (taVaga()) {
        //    comanda = new Comanda();
        //    statusMesa = "Ocupada";
        //    System.out.println("Cliente " + cliente.getNome() + " adicionado à mesa " + nome);
        //} else {
        //    System.out.println("A mesa " + nome + " não está disponível para adicionar o cliente.");
        //}
    }

    public void excluirCliente(Cliente cliente) {
        //if (statusMesa.equals("Ocupada") && comanda != null && comanda.getCliente().equals(cliente)) {
        //    comanda = null;
        //    statusMesa = "Livre";
        //    System.out.println("Cliente " + cliente.getNome() + " removido da mesa " + nome);
        //} else {
        //    System.out.println("A mesa " + nome + " não possui cliente para remover.");
        //}
    }

    public void fazerPedido() {
        //if (statusMesa.equals("Ocupada") && comanda != null) {

            //comanda.adicionarProduto(produto);
            //System.out.println("Pedido realizado com sucesso na mesa " + nome);
        //} else {
        //    System.out.println("A mesa " + nome + " não possui cliente para fazer o pedido.");
        //}
    }

    public void taCheia() {
        if (statusMesa == StatusMesa.ABERTA) {
            System.out.println("A mesa " + nome + " está livre e disponível para receber clientes.");
        } else {
            System.out.println("A mesa " + nome + " está ocupada e não está disponível para receber clientes.");
        }
    }
    
}
