public class Mesa {
    private int id;
    private Funcionario funcionario;
    private String nome;
    private String codigo;
    private int numero; 
    private String statusMesa;
    private int quantidadeMaxima;
    private Comanda comanda;

    public Mesa(int id, Funcionario funcionario, String nome, String codigo, int numero, int quantidadeMaxima) {
        this.id = id;
        this.funcionario = funcionario;
        this.nome = nome;
        this.codigo = codigo;
        this.numero = numero;
        this.statusMesa = "Livre";
        this.quantidadeMaxima = quantidadeMaxima;
        this.comanda = null;
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

    public String getStatusMesa() {
        return statusMesa;
    }

    public void setStatusMesa(String statusMesa) {
        this.statusMesa = statusMesa;
    }

    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }

    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }

    public boolean taVaga() {
        return statusMesa.equals("Livre");
    }

    public void adicionarCliente(Cliente cliente) {
        if (taVaga()) {
            comanda = new Comanda();
            statusMesa = "Ocupada";
            System.out.println("Cliente " + cliente.getNome() + " adicionado à mesa " + nome);
        } else {
            System.out.println("A mesa " + nome + " não está disponível para adicionar o cliente.");
        }
    }

    public void excluirCliente(Cliente cliente) {
        if (statusMesa.equals("Ocupada") && comanda != null && comanda.getCliente().equals(cliente)) {
            comanda = null;
            statusMesa = "Livre";
            System.out.println("Cliente " + cliente.getNome() + " removido da mesa " + nome);
        } else {
            System.out.println("A mesa " + nome + " não possui cliente para remover.");
        }
    }

    public void fazerPedido() {
        if (statusMesa.equals("Ocupada") && comanda != null) {

            //comanda.adicionarProduto(produto);
            System.out.println("Pedido realizado com sucesso na mesa " + nome);
        } else {
            System.out.println("A mesa " + nome + " não possui cliente para fazer o pedido.");
        }
    }

    public void taCheia() {
        if (statusMesa.equals("Livre")) {
            System.out.println("A mesa " + nome + " está livre e disponível para receber clientes.");
        } else {
            System.out.println("A mesa " + nome + " está ocupada e não está disponível para receber clientes.");
        }
    }
    
}
