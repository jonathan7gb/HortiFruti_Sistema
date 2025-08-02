package com.hortfrutapp.view;
import java.util.Scanner;

public class RemocaoProdutos {
	
	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);

			
	public String removerFruta() {
		System.out.print("\n|| Digite o nome da Fruta que deseja remover: ");
		String nome = leiaStr.nextLine();
		return nome;
	}

	public String removerVerdura() {
		System.out.print("\n|| Digite o nome da Verdura que deseja remover: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
			
	public String removerTempero() {
		System.out.print("\n|| Digite o nome do Tempero que deseja remover: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
			
}

	