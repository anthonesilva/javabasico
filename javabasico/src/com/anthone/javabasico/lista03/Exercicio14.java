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
public class Exercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CONTANDO NÚMEROS PARES E ÍMPARES\n");
		
		Scanner scan = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Digite o " + i + "º número inteiro: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				contPar++;
			} else if (numero % 2 != 0) {
				contImpar++;
			}
			
		}
		
		System.out.println("\nQuantidade de números pares: " + contPar);
		System.out.println("Quantidade de números ímpares: " + contImpar);
		
		scan.close();
		
	}

}
