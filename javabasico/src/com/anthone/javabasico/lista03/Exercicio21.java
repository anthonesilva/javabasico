/**
 * 
 * @author Anthone Silva
 * 
 * 3 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CALCULANDO MÉDIA DE ALUNOS POR TURMA\n");

		Scanner scan = new Scanner(System.in);

		int qtdeTurmas, qtdeAlunos;
		boolean valida = false;
		double soma = 0, media;

		System.out.println("Digite a quantidade de turmas: ");
		qtdeTurmas = scan.nextInt();

		for (int i = 1; i <= qtdeTurmas; i++) {

			valida = true;
			
			do {

				System.out.println("Digite a quantidade de alunos para a turma " + i + ": ");
				qtdeAlunos = scan.nextInt();

				if (qtdeAlunos <= 40) {
					valida = false;
				} else {
					System.out.println("Quantidade maior que 40 alunos por turma. Digite novamente!");
				}

			} while (valida);

			soma += qtdeAlunos;
		}
		
		media = soma / qtdeTurmas;
		
		System.out.println("A quantidade média de alunos por turma é: " + media);

		scan.close();

	}

}
