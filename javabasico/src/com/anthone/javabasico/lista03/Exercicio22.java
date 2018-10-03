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
public class Exercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("COLEÇÃO DE CDs\n");

		Scanner scan = new Scanner(System.in);

		int qtdeCDs;
		double preco = 0, soma = 0, media;

		System.out.println("Digite a quantidade de CDs: ");
		qtdeCDs = scan.nextInt();

		for (int i = 1; i <= qtdeCDs; i++) {

			System.out.println("Digite o valor do CD " + i + ": ");
			preco = scan.nextDouble();

			soma += preco;
		}

		media = soma / qtdeCDs;

		System.out.println("O valor médio gasto por CD é: R$ " + media);

		scan.close();

	}

}
