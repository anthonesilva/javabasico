package com.anthone.javabasico.lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("FORMULÁRIO DE CADASTRO\n");
		
		String nome = "";
		int idade = 0;
		double salario = 0;
		String sexo;
		char estadoCivil;
		int cont = 0; 
		
		do {		
			
			do {
				
				System.out.println("Digite o seu nome:");
				nome = scan.nextLine();
				
				if (nome.length() < 4) {
					System.out.println("O nome deve ter mais do que 3 caracteres. Tente novamente.\n");
				}
				
			} while (nome.length() < 4);
			cont++;
			
			do {
				
				System.out.println("Digite a sua idade:");
				idade = scan.nextInt();
				
				if (idade < 0 || idade > 150) {
					System.out.println("Idade inválida. Deve ser entre 0 e 150. Tente novamente!\n");
				}
				
			} while (idade < 0 || idade > 150);
			cont++;
						
			do {
				
				System.out.println("Digite seu salário (R$):");
				salario = scan.nextDouble();
				
				if (salario == 0) {
					System.out.println("O salário não pode ser zero! Tente novamente!\n");
				}
				
			} while (salario == 0);
			cont++;
			scan.nextLine();
			do {
				
				System.out.println("Informe o sexo (M - Masculino, F - Feminino):");
				sexo = scan.nextLine();
				
				if (!sexo.startsWith("f") && !sexo.startsWith("m")) {
					System.out.println("Sexo inválido! Tente novamente!\n");
				}
				
			} while (!sexo.startsWith("f") && !sexo.startsWith("m"));
			cont++;
			
			do {
				System.out.println("Digite seu estado civil: \nS - Solteiro\nC - Casado\nV - Viúvo\nD - Divorciado\nDigite a letra correspondente:");
				estadoCivil = scan.nextLine().charAt(0);
				
				if (estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' && 
						estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D') {
					System.out.println("Estado civil inválido! Tente novamente!\n");
				}
			} while (estadoCivil != 's' && estadoCivil != 'S' && estadoCivil != 'c' && estadoCivil != 'C' && 
					estadoCivil != 'v' && estadoCivil != 'V' && estadoCivil != 'd' && estadoCivil != 'D');
			cont++;
			
		} while (cont < 5);
		
		if (cont == 5) {
			System.out.println("\nCadastro realizado com sucesso!");
		} else {
			System.out.println("O cadastro não foi realizado, tente novamente!");
		}
		
		scan.close();
	}

}
