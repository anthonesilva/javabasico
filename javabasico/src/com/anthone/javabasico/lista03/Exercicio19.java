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
public class Exercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CALCULANDO MÉDIAS");
		
		double nota = 0;
		int contNotas = 0;
		int continuar = 0;
		
		Scanner scan = new Scanner(System.in);

		do {
			
			System.out.println("\nDigite um nota: ");
			nota += scan.nextDouble();
			
			System.out.println("Deseja continuar?\n1 - Sim\n2 - Não\nDigite e tecle [ENTER]: ");
			continuar = scan.nextInt();
			
			contNotas++;
			
		} while (continuar == 1);
		
		double media = nota / contNotas;
		//Math.round(media);
		
		System.out.printf("\nA média das %d notas informadas é: %.2f", contNotas, media);
		
		scan.close();
	}

}
