package com.hortfrutapp.view;
import java.util.Scanner;


public class Menus {

	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);
	
	public int menu () {
		
		System.out.println("\n||   HORTIFRUTI SISTEMA   ||");
		System.out.println("|| 1 - Cadastrar Produto  ||");
		System.out.println("|| 2 - Listar Produto     ||");
		System.out.println("|| 3 - Editar Produto     ||");
		System.out.println("|| 4 - Remover Produto    ||");
		System.out.println("|| 5 - Total de Produtos  ||");
		System.out.println("|| 0 - Sair do Sistema    ||");
		System.out.println("|| ====================== ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuCadastro() {
		System.out.println("\n|| Cadastrar Produto     ||");
		System.out.println("|| ===================== ||");
		System.out.println("|| 1 - Cadastrar Fruta   ||");
		System.out.println("|| 2 - Cadastrar Verdura ||");
		System.out.println("|| 3 - Cadastrar Tempero ||");
		System.out.println("|| ===================== ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuLista() {
		System.out.println("\n||      Listar Produtos      ||");
		System.out.println("|| ========================= ||");
		System.out.println("|| 1 - Listar Frutas         ||");
		System.out.println("|| 2 - Listar Verduras       ||");
		System.out.println("|| 3 - Listar Temperos       ||");
		System.out.println("|| 4 - Listar Todos Produtos ||");
		System.out.println("|| ========================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}

	//====================================================================
	
	public int menuEdicao() {
		System.out.println("\n||      Edição Produtos      ||");
		System.out.println("|| ========================= ||");
		System.out.println("|| 1 - Editar Fruta         ||");
		System.out.println("|| 2 - Editar Verdura       ||");
		System.out.println("|| 3 - Editar Temperos      ||");
		System.out.println("|| ========================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoFruta() {
		System.out.println("\n||        Editar Fruta       ||");
		System.out.println("|| ========================= ||");
		System.out.println("|| 1 - Editar Nome           ||");
		System.out.println("|| 2 - Editar Preço (R$)     ||");
		System.out.println("|| 3 - Editar Quantidade     ||");
		System.out.println("|| 4 - Editar Peso (Kg)      ||");
		System.out.println("|| ========================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoVerdura() {
		System.out.println("\n||        Editar Verdura       ||");
		System.out.println("|| ========================= ||");
		System.out.println("|| 1 - Editar Nome           ||");
		System.out.println("|| 2 - Editar Preço (R$)     ||");
		System.out.println("|| 3 - Editar Quantidade     ||");
		System.out.println("|| 4 - Editar Tipo           ||");
		System.out.println("|| ========================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoTempero() {
		System.out.println("\n||        Editar Tempero       ||");
		System.out.println("|| ========================= ||");
		System.out.println("|| 1 - Editar Nome           ||");
		System.out.println("|| 2 - Editar Preço (R$)     ||");
		System.out.println("|| 3 - Editar Quantidade     ||");
		System.out.println("|| 4 - Editar Tipo           ||");
		System.out.println("|| ========================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuRemover() {
		System.out.println("\n||       Remover Produtos        ||");
		System.out.println("|| ============================= ||");
		System.out.println("|| 1 - Remover Fruta             ||");
		System.out.println("|| 2 - Remover Verdura           ||");
		System.out.println("|| 3 - Remover Tempero           ||");
		System.out.println("|| ============================= ||");
		System.out.println("|| 4 - Remover todas as Frutas   ||");
		System.out.println("|| 5 - Remover todas as Verduras ||");
		System.out.println("|| 6 - Remover todos os Temperos ||");
		System.out.println("|| ============================= ||");
		System.out.println("|| 7 - Remover Todos Produtos    ||");
		System.out.println("|| ============================= ||");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuRemoverFrutas() {
		System.out.println("\n|| Você tem certeza que deseja remover todas as frutas do estoque? |");
		System.out.println("|| 1 - Sim");
		System.out.println("|| 2 - Não");
		System.out.println("|| ===============");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuRemoverVerduras() {
		System.out.println("\n|| Você tem certeza que deseja remover todas as verduras do estoque? |");
		System.out.println("|| 1 - Sim");
		System.out.println("|| 2 - Não");
		System.out.println("|| ===============");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuRemoverTemperos() {
		System.out.println("\n|| Você tem certeza que deseja remover todos os temperos do estoque? |");
		System.out.println("|| 1 - Sim");
		System.out.println("|| 2 - Não");
		System.out.println("|| ===============");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
	
	//====================================================================
	
	public int menuRemoverTodos() {
		System.out.println("\n|| Você tem certeza que deseja remover todos os produtos do estoque? |");
		System.out.println("|| 1 - Sim");
		System.out.println("|| 2 - Não");
		System.out.println("|| ===============");
		System.out.print("|| Sua escolha: ");
		int opcao = leiaNum.nextInt();
		return opcao;
	}
}
