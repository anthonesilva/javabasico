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
public class Exercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("SOMANDO N�MEROS E CALCULANDO A M�DIA");
		
		Scanner scan = new Scanner(System.in);
		
		double numero, soma = 0, media;
		
		for (int i=1; i<=5; i++) {
			
			System.out.println("Digite o " + i + "� n�mero: ");
			numero = scan.nextDouble();
			
			soma += numero;
			
		}
		
		media = soma/5;
		
		System.out.println("\nA soma dos n�meros �: " + Math.round(soma));
		System.out.println("A m�dia dos n�meros �: " + Math.round(media));
		
		scan.close();

	}

}
