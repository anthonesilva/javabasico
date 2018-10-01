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
public class Exercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("TABUADA\n");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número do qual deseja ver a tabuada: ");
		
		int numeroEscolhido = scan.nextInt();
		double resultado;
		
		System.out.println("\nTabuada do número " + numeroEscolhido + ":\n");
				
		for (int i=1; i<=10; i++) {
			
			resultado = numeroEscolhido * i;
			System.out.println(numeroEscolhido + " x " + i + " = " + Math.round(resultado));
		}

		scan.close();
		
	}

}
