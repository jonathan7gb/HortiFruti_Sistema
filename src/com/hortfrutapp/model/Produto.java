package com.hortfrutapp.model;

public class Produto {
	protected int id;
    protected String nome;
    protected double preco;
    protected int quantidade;
    protected static int totalProdutos; 
    protected static int contagemIDS = 1; 

    public Produto(){
    	Produto.setIdProduto();
    	this.id = 0;
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
        Produto.addTotalProdutos();
    }
    
    public Produto (int id, String nome, double preco, int quantidade){
    	Produto.setIdProduto();
    	this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        Produto.addTotalProdutos();
    }
    
    public int getId() {
    	return this.id;
    }
    
    public void setId(int id){
    	this.id = id;
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
    
    public static void addTotalProdutos() {
    	totalProdutos++;
    }
    
    public static void setTotalProdutos(int totalProdutos) {
    	Produto.totalProdutos = totalProdutos;
    }
    
    public static int getIdProduto() {
    	return contagemIDS;
    }
    
    public static void setIdProduto() {
    	contagemIDS++;
    }
    
    @Override
	public String toString() {		
		return "- ID: " + this.id + "\n- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade;
	}
}
