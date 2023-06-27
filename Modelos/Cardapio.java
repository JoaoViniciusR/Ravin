package Modelos;

import Modelos.Produto;

import java.util.List;
import Enumeradores.CategoriaCardapio;

public class Cardapio {
    private int id;
    private String nome;
    private String descricao;
    private List<Produto> listaProdutosCardapio;
    private String codigo;
    private CategoriaCardapio categoria;
    private boolean status;

    public Cardapio(int id, String nome, String descricao, List<Produto> listaProdutosCardapio, String codigo, CategoriaCardapio categoria, boolean status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.listaProdutosCardapio = listaProdutosCardapio;
        this.codigo = codigo;
        this.categoria = categoria;
        this.status = status;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getListaProdutosCardapio() {
        return listaProdutosCardapio;
    }

    public void setListaProdutosCardapio(List<Produto> listaProdutosCardapio) {
        this.listaProdutosCardapio = listaProdutosCardapio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCardapio categoria) {
        this.categoria = categoria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
