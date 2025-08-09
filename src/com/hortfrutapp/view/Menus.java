package com.hortfrutapp.view;
import java.util.Scanner;


public class Menus {

	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);
	RetornosEErros retornos_e_erros = new RetornosEErros();
	
	public int menu () {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||   HORTIFRUTI SISTEMA   ||");
			System.out.println("|| 1 - Cadastrar Produto  ||");
			System.out.println("|| 2 - Listar Produto     ||");
			System.out.println("|| 3 - Editar Produto     ||");
			System.out.println("|| 4 - Remover Produto    ||");
			System.out.println("|| 5 - Total de Produtos  ||");
			System.out.println("|| 0 - Sair do Sistema    ||");
			System.out.println("|| ====================== ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
		
	}
	
	//====================================================================
	
	public int menuCadastro() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n|| Cadastrar Produto     ||");
			System.out.println("|| ===================== ||");
			System.out.println("|| 1 - Cadastrar Fruta   ||");
			System.out.println("|| 2 - Cadastrar Verdura ||");
			System.out.println("|| 3 - Cadastrar Tempero ||");
			System.out.println("|| ===================== ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuLista() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||      Listar Produtos      ||");
			System.out.println("|| ========================= ||");
			System.out.println("|| 1 - Listar Frutas         ||");
			System.out.println("|| 2 - Listar Verduras       ||");
			System.out.println("|| 3 - Listar Temperos       ||");
			System.out.println("|| 4 - Listar Todos Produtos ||");
			System.out.println("|| ========================= ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}

	//====================================================================
	
	public int menuEdicao() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||      Edição Produtos      ||");
			System.out.println("|| ========================= ||");
			System.out.println("|| 1 - Editar Fruta          ||");
			System.out.println("|| 2 - Editar Verdura        ||");
			System.out.println("|| 3 - Editar Temperos       ||");
			System.out.println("|| ========================= ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoFruta() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||        Editar Fruta       ||");
			System.out.println("|| ========================= ||");
			System.out.println("|| 1 - Editar Nome           ||");
			System.out.println("|| 2 - Editar Preço (R$)     ||");
			System.out.println("|| 3 - Editar Quantidade     ||");
			System.out.println("|| 4 - Editar Peso (Kg)      ||");
			System.out.println("|| ========================= ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoVerdura() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||       Editar Verdura      ||");
			System.out.println("|| ========================= ||");
			System.out.println("|| 1 - Editar Nome           ||");
			System.out.println("|| 2 - Editar Preço (R$)     ||");
			System.out.println("|| 3 - Editar Quantidade     ||");
			System.out.println("|| 4 - Editar Tipo           ||");
			System.out.println("|| ========================= ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuEscolhaItemEdicaoTempero() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n||       Editar Tempero      ||");
			System.out.println("|| ========================= ||");
			System.out.println("|| 1 - Editar Nome           ||");
			System.out.println("|| 2 - Editar Preço (R$)     ||");
			System.out.println("|| 3 - Editar Quantidade     ||");
			System.out.println("|| 4 - Editar Tipo           ||");
			System.out.println("|| ========================= ||");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuRemover() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
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
			String opcao = leiaStr.nextLine();
	
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuRemoverFrutas() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n|| Você tem certeza que deseja remover todas as frutas do estoque? |");
			System.out.println("|| 1 - Sim");
			System.out.println("|| 2 - Não");
			System.out.println("|| ===============");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();
		
			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}

		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuRemoverVerduras() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n|| Você tem certeza que deseja remover todas as verduras do estoque? |");
			System.out.println("|| 1 - Sim");
			System.out.println("|| 2 - Não");
			System.out.println("|| ===============");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();

			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuRemoverTemperos() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n|| Você tem certeza que deseja remover todos os temperos do estoque? |");
			System.out.println("|| 1 - Sim");
			System.out.println("|| 2 - Não");
			System.out.println("|| ===============");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();

			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}
		return opcaoInt;
	}
	
	//====================================================================
	
	public int menuRemoverTodos() {
		boolean valido = false;
		int opcaoInt = 0;

		while(!valido) {
			System.out.println("\n|| Você tem certeza que deseja remover todos os produtos do estoque? |");
			System.out.println("|| 1 - Sim");
			System.out.println("|| 2 - Não");
			System.out.println("|| ===============");
			System.out.print("|| Sua escolha: ");
			String opcao = leiaStr.nextLine();

			try{
				opcaoInt = Integer.parseInt(opcao);
				valido = true;
			}catch(NumberFormatException  e){
				retornos_e_erros.erroDigiteNumero();
			}
		}

		return opcaoInt;
	}
}
