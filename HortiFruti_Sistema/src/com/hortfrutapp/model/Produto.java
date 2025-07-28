package com.hortfrutapp.model;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;
    protected static int totalProdutos; 

    public Produto(){
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
        Produto.setTotalProdutos();
    }
    
    public Produto (String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        Produto.setTotalProdutos();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public static int getTotalProdutos() {
        return totalProdutos;
    }
    
    public static void setTotalProdutos() {
    	totalProdutos++;
    }
    
    @Override
	public String toString() {		
		return "- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade;
	}
}
