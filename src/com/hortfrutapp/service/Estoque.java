package com.hortfrutapp.service;
import com.hortfrutapp.model.*;
import com.hortfrutapp.view.Atendente;

import java.util.List;
import java.util.ArrayList;

public class Estoque {

	private List<Produto> estoqueProdutos;

	public Estoque () {
		estoqueProdutos = new ArrayList<>();
	}
	
	public List<Produto> getEstoqueProdutos(){
		return estoqueProdutos;
	}
	
	public void setEstoqueProduto (List<Produto>estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
	

	public void gerenciadorApp (int opcao, Atendente atendente){
		
		
        switch (opcao){
            case 1 ->{
            	
            	int escolha = atendente.menuCadastro();
            	
            	if(escolha == 1) {
            		Fruta fruta = atendente.cadastrarFrutas(); 
            		if (fruta != null) {
            			estoqueProdutos.add(fruta);
            		}
            	}else if(escolha == 2) {
            		Verdura verdura = atendente.cadastrarVerduras();
                    if (verdura != null) {
                    	estoqueProdutos.add(verdura); 
                    }
            	}else if(escolha == 3) {
            		Tempero tempero = atendente.cadastrarTemperos();
                    if (tempero != null) {
                    	estoqueProdutos.add(tempero); 
                    }
            	}else {
            		atendente.erro();
            	}
            	
            }//FECHA CASE 1 GERENCIADOR APP
            
            case 2 ->{
            	
            	int escolha = atendente.menuLista();
            	boolean encontrado = false;
            	
            	if(escolha == 1) {
            		
            		if (estoqueProdutos.isEmpty()) {
                        atendente.produtoN();
                    }else {
                    	System.out.println("\n|| LISTA DE FRUTAS ||\n");
	            		for (Produto produto : estoqueProdutos) {
	            			if(produto instanceof Fruta fruta){
	            				System.out.println(fruta);
	            				System.out.println("------------------");
	            				encontrado = true;
	            			}
	            		}
	            		
	            		if(encontrado == false) {
	            			atendente.frutaN();
	            		}
	                }
            		
            		
            	}else if(escolha == 2) {
            		 
            		if (estoqueProdutos.isEmpty()) {
                        atendente.produtoN();
                    }else {
                    	System.out.println("\n|| LISTA DE VERDURAS ||\n");
	            		for (Produto produto : estoqueProdutos) {
	            			if(produto instanceof Verdura verdura){
	            				System.out.println(verdura);
	            				System.out.println("------------------");
	            				encontrado = true;
	            			}
	            		}
	            		
	            		if(encontrado == false) {
	            			atendente.verduraN();
	            		}
	                }
                    
            	}else if(escolha == 3) {
            		
            		if (estoqueProdutos.isEmpty()) {
                        atendente.produtoN();
                    }else {
                    	System.out.println("\n|| LISTA DE TEMPEROS ||\n");
	            		for (Produto produto : estoqueProdutos) {
	            			if(produto instanceof Tempero tempero){
	            				System.out.println(tempero);
	            				System.out.println("------------------");
	            				encontrado = true;
	            			}
	            		}
	            		
	            		if(encontrado == false) {
	            			atendente.verduraN();
	            		}
	                }
            		
            	}else if(escolha == 4){
            		if (estoqueProdutos.isEmpty()) {
                        atendente.produtoN();
                    }else {
                    	System.out.println("\n|| LISTA DE PRODUTOS ||\n");
	            		for (Produto produto : estoqueProdutos) {
	            			if(produto instanceof Verdura verdura){
	            				System.out.println(verdura);
	            				System.out.println("------------------");
	            				encontrado = true;
	            			}else if(produto instanceof Fruta fruta){
	            				System.out.println(fruta);
	            				System.out.println("------------------");
	            				encontrado = true;
	            			}else if(produto instanceof Tempero tempero){
		            			System.out.println(tempero);
		            			System.out.println("------------------");
		            			encontrado = true;
		            		}
	            		}
                    }
            	}else {
            		atendente.erro();
            	}
            	
            }//FECHA CASE 2 GERENCIADOR APP
            
            case 3 ->{
            	
                int escolha = atendente.menuRemover();
                boolean removido = false;
                
                switch(escolha) {
	                case 1 -> {
	                	String nome = atendente.removerFruta();
	                	removido = false; 

	                    for( int indice = 0; indice < estoqueProdutos.size(); indice ++) {
	                        if (estoqueProdutos.get(indice).getNome().equalsIgnoreCase(nome)) {
	                     	   estoqueProdutos.remove(indice);
	                     	   removido = true;
	                           atendente.frutaRemovida();
	                           Fruta.setTotalFrutas(Fruta.getTotalFrutas()-1);
	                           Produto.setTotalProdutos(Produto.getTotalProdutos()-1);
	                           break;
	                           
	                        }
	                    }
	                    if (!removido) {
	                        atendente.frutaNaoEncontrado(nome);
	                 }
	                }
	                
	                case 2 -> {
	                	String nome = atendente.removerVerdura();
	                    removido = false; 

	                    for( int indice = 0; indice < estoqueProdutos.size(); indice ++) {
	                        if (estoqueProdutos.get(indice).getNome().equalsIgnoreCase(nome)) {
	                     	   estoqueProdutos.remove(indice);
	                            removido = true;
	                            atendente.verduraRemovida();
	                            Verdura.setTotalVerduras(Verdura.getTotalVerduras()-1);
	                            Produto.setTotalProdutos(Produto.getTotalProdutos()-1);
	                            break;
	                        }
	                    }
	                    if (!removido) {
	                        atendente.verduraNaoEncontrado(nome);
	                 }
	                }
	                
	                case 3 -> {
	                	String nome = atendente.removerTempero();
	                	removido = false; 
	                	
	                	for( int indice = 0; indice < estoqueProdutos.size(); indice ++) {
	                		if (estoqueProdutos.get(indice).getNome().equalsIgnoreCase(nome)) {
	                			estoqueProdutos.remove(indice);
	                			removido = true;
	                			atendente.temperoRemovida();
	                			Tempero.setTotalTemperos(Tempero.getTotalTemperos()-1);
	                			Produto.setTotalProdutos(Produto.getTotalProdutos()-1);
	                			break;
	                		}
	                	}
	                	if (!removido) {
	                		atendente.frutaNaoEncontrado(nome);
	                	}
	                }
	                
	                case 4 -> {
	                	int escolha2 = atendente.menuRemoverFrutas();
	                	
	                	if(estoqueProdutos.isEmpty()) {
	            			atendente.produtoN();
	            		}else {
	            			if(escolha2 == 1) {
	            				estoqueProdutos.removeIf(produto -> produto instanceof Fruta);
	            				Produto.setTotalProdutos(Produto.getTotalProdutos() - Fruta.getTotalFrutas());
	            				Fruta.setTotalFrutas(0);
	            			}else if(escolha2 == 2) {
	            				System.out.println("\n|| Ok! Fica Tranquilo, as frutas não foram removidas ||");
	            			}else {
	            				atendente.erro();
	            			}
	            		}
	                }
	                
	                case 5 -> {
	                	int escolha2 = atendente.menuRemoverVerduras();
	                	removido = false; 
	                	
	                	if(estoqueProdutos.isEmpty()) {
	            			atendente.produtoN();
	            		}else {
	            			if(escolha2 == 1) {
		                		estoqueProdutos.removeIf(produto -> produto instanceof Verdura);
		                		Produto.setTotalProdutos(Produto.getTotalProdutos() - Verdura.getTotalVerduras());
	            				Verdura.setTotalVerduras(0);
		                	}else if(escolha2 == 2) {
		                		System.out.println("\n|| Ok! Fica Tranquilo, as verduras não foram removidas ||");
		                	}else {
		                		atendente.erro();
		                	}
		                }
	                }
	                
	                case 6 -> {
	                	int escolha2 = atendente.menuRemoverTemperos();
	                	removido = false; 
	                	
	                	if(estoqueProdutos.isEmpty()) {
	            			atendente.produtoN();
	            		}else {
	            			if(escolha2 == 1) {
	            				estoqueProdutos.removeIf(produto -> produto instanceof Tempero);
	            				Produto.setTotalProdutos(Produto.getTotalProdutos() - Tempero.getTotalTemperos());
	            				Tempero.setTotalTemperos(0);
		                	}else if(escolha2 == 2) {
		                		System.out.println("\n|| Ok! Fica Tranquilo, os temperos não foram removidos ||");
		                	}else {
		                		atendente.erro();
		                	}
	            		}
	                }
	                
	                case 7 -> {
	                	int escolha2 = atendente.menuRemoverTodos();
	                   	
	                	if(estoqueProdutos.isEmpty()) {
	            			atendente.produtoN();
	            		}else if(escolha2 == 1) {
	                		estoqueProdutos.removeIf(produto -> produto instanceof Fruta || produto instanceof Verdura || produto instanceof Tempero);
	                		Produto.setTotalProdutos(0);
	                		Fruta.setTotalFrutas(0);
	                		Verdura.setTotalVerduras(0);
	                		Tempero.setTotalTemperos(0);
	                	}else if(escolha2 == 2) {
	                		System.out.println("\n|| Ok! Fica Tranquilo, os produtos não foram removidos ||");
	                	}else {
	                		atendente.erro();
	                	}
	                }
	                
	                default ->{
	                	atendente.erro();
	                }
                }
                
            } //FECHA CASE 3 GERENCIADOR APP

            case 4 ->{
                atendente.totalProdutos();
            } //FECHA CASE 4 GERENCIADOR APP

           
        }
	}
}