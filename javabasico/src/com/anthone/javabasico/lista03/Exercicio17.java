/**
 * 
 * @author Anthone Silva
 * 
 * 1 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CALCULANDO O FATORIAL\n");
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0, resultado = 0;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		for (int i = numero; i>0; i--) {
			
			if (i == numero) {
				resultado = numero * (i-1);
			} else if (i > 1) {
				resultado = resultado * (i-1);
			} else {
				System.out.println("Cálculo finalizado com sucesso!");
			}
		}
		
		System.out.println("\nO fatorial do número " + numero + " é igual a: " + resultado);
		
		scan.close();
			
	}

}
