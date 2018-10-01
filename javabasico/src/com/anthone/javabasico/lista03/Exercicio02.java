package com.anthone.javabasico.lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CADASTRO DE USU�RIO");
		String usuario = "";
		String senha = "";
		
		do {
			System.out.println("Digite o usu�rio que deseja: ");
			usuario = scan.nextLine();
			
			System.out.println("Digite a senha desejada: ");
			senha = scan.nextLine();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("ERRO! O usu�rio n�o pode ser igual a senha, cadastre novamente.\n\n");
			}
		} while (usuario.equalsIgnoreCase(senha));
		
		System.out.println("\nUsu�rio '" + usuario + "' cadastrado com sucesso!");
		
		scan.close();

	}

}
