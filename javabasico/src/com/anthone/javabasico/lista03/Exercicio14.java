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

		System.out.println("CONTANDO N�MEROS PARES E �MPARES\n");
		
		Scanner scan = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar = 0;
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Digite o " + i + "� n�mero inteiro: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				contPar++;
			} else if (numero % 2 != 0) {
				contImpar++;
			}
			
		}
		
		System.out.println("\nQuantidade de n�meros pares: " + contPar);
		System.out.println("Quantidade de n�meros �mpares: " + contImpar);
		
		scan.close();
		
	}

}
