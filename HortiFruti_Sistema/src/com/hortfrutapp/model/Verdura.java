package com.hortfrutapp.model;

public class Verdura extends Produto {
	
    private String tipo;
    private static int totalVerduras;

    public Verdura (){
        super();
        this.tipo = "";
        Verdura.setTotalVerduras();
    }

    public Verdura(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
        Verdura.setTotalVerduras();
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static void setTotalVerduras() {
    	Verdura.totalVerduras++;
	}
	
	public static int getTotalVerduras() {
		return totalVerduras;
	}
    
    @Override
	public String toString() {		
		return "- Nome: " + this.nome + "\n- Preço: R$" + this.preco + "\n- Quantidade: " + this.quantidade + "\n- Tipo: " + this.tipo;
	}
}

