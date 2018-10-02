/**
 * 
 * @author Anthone Silva
 * 
 * 2 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CALCULANDO IDADES");

		double idades = 0;
		int contIdades = 0;
		int continuar = 0;

		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("\nDigite um idade: ");
			idades += scan.nextDouble();

			System.out.println("Deseja continuar?\n1 - Sim\n2 - Não\nDigite e tecle [ENTER]: ");
			continuar = scan.nextInt();

			contIdades++;

		} while (continuar == 1);

		double media = idades / contIdades;

		System.out.printf("\nA média das %d idades informadas é: %.2f", contIdades, media);
		
		if (media >= 0 && media <= 25) {
			System.out.println("\nA turma é jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("\nA turma é adulta!");
		} else {
			System.out.println("\nA turma é idosa!");
		}

		scan.close();

	}

}
