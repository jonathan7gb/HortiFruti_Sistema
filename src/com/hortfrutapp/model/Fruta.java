package com.hortfrutapp.model;


public class Fruta extends Produto {

	private double peso;
	private static int totalFrutas;
	
		public Fruta () {
			this.peso = 0.0;
			Fruta.setTotalFrutas();
		}
		
		public Fruta (String nome, double preco, int quantidade, double peso) {
			super(nome, preco, quantidade);
			this.peso = peso;
			Fruta.setTotalFrutas();
		}

		public double getPeso (){
			return peso;
		}

		public void setPeso (double peso){
			this.peso = peso;
		}
		
		public static void setTotalFrutas() {
			Fruta.totalFrutas++;
		}
		
		public static int getTotalFrutas() {
			return totalFrutas;
		}
		
		@Override
		public String toString() {		
			return "- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade + "\n- Peso: " + this.peso + "kg";
		}
		
		
		
}
