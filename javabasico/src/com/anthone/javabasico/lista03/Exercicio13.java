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
public class Exercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("CALCULANDO A POTÊNCIA\n");
		
		Scanner scan = new Scanner(System.in);
		
		double base, resultado;
		int expoente;
		
		System.out.println("Digite a base: ");
		base = scan.nextDouble();
		
		System.out.println("Digite o expoente: ");
		expoente = scan.nextInt();
		

		resultado = base;
		
		for (int i=1; i<expoente; i++) {
			
			resultado *= base;
			
		}
		
		System.out.println("\nO resultado da base " + Math.round(base) +  " e expoente " + expoente + " é: " + Math.round(resultado));
		
		scan.close();
		
	}

}
