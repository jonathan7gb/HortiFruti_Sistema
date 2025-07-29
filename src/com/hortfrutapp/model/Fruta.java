package com.hortfrutapp.model;


public class Fruta extends Produto {

	private double peso;
	private static int totalFrutas;
	
		public Fruta () {
			this.peso = 0.0;
			Fruta.addTotalFrutas();
		}
		
		public Fruta (int id, String nome, double preco, int quantidade, double peso) {
			super(id, nome, preco, quantidade);
			this.peso = peso;
			Fruta.addTotalFrutas();
		}

		public double getPeso (){
			return peso;
		}

		public void setPeso (double peso){
			this.peso = peso;
		}
		
		public static void addTotalFrutas() {
			Fruta.totalFrutas++;
		}
		
		public static int getTotalFrutas() {
			return totalFrutas;
		}
		
		public static void setTotalFrutas(int totalFrutas) {
			Fruta.totalFrutas = totalFrutas;
		}
		
		@Override
		public String toString() {		
			return "- ID: " + this.id + "\n- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade + "\n- Peso: " + this.peso + "kg";
		}
		
		
		
}
