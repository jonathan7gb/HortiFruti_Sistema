package com.hortfrutapp.view;
import java.util.Scanner;
import com.hortfrutapp.model.*;

public class EdicaoProdutos {

	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);

			
	public String editarFruta() {
		System.out.print("\n|| Digite o nome da Fruta que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}

	public String editarVerdura() {
		System.out.print("\n|| Digite o nome da Verdura que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
			
	public String editarTempero() {
		System.out.print("\n|| Digite o nome do Tempero que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
}
