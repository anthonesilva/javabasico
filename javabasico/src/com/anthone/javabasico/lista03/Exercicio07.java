/**
 * 
 * @author Anthone Silva
 *
 * 30 de set de 2018
 *
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("MAIOR NÚMERO");
		
		double numero, maiorNumero = Double.MIN_VALUE;
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Digite o " + i + "º número: ");
			numero = scan.nextDouble();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
		}
		
		System.out.println("\nO número maior é o: " + maiorNumero);
		
		scan.close();
		
	}

}
