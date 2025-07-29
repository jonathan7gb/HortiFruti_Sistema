package com.hortfrutapp.model;

public class Tempero extends Produto{

	private String tipo;
	private static int totalTemperos;
	
	public Tempero() {
		super();
		this.tipo = "";
		Tempero.addTotalTemperos();
	}
	
	public Tempero(int id, String nome, double preco, int quantidade, String tipo) {
		super(id, nome, preco, quantidade);
		this.tipo = tipo;
		Tempero.addTotalTemperos();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public static int getTotalTemperos() {
		return totalTemperos;
	}

	public static void addTotalTemperos() {
		Tempero.totalTemperos++;
	}
	
	public static void setTotalTemperos(int totalTemperos) {
		Tempero.totalTemperos = totalTemperos;
	}

	@Override
	public String toString() {
		return "- ID: " + this.id + "\n- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade + "\n- Tipo: " + this.tipo;
	}
}
