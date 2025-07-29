package com.hortfrutapp.model;

public class Verdura extends Produto {
	
    private String tipo;
    private static int totalVerduras;

    public Verdura (){
        super();
        this.tipo = "";
        Verdura.addTotalVerduras();
    }

    public Verdura(int id, String nome, double preco, int quantidade, String tipo) {
        super(id, nome, preco, quantidade);
        this.tipo = tipo;
        Verdura.addTotalVerduras();
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static void addTotalVerduras() {
    	Verdura.totalVerduras++;
	}
	
	public static int getTotalVerduras() {
		return totalVerduras;
	}
	
	public static void setTotalVerduras(int totalVerduras) {
		Verdura.totalVerduras = totalVerduras;
	}
    
    @Override
	public String toString() {		
		return  "- ID: " + this.id + "\n- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade + "\n- Tipo: " + this.tipo;
	}
}

