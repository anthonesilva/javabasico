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
public class Exercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("IMPRIMINDO N�MEROS INTEIROS DE UM INTERVALO E SOMANDO-OS\n");
		
		double num1, num2, inteiros, soma = 0;		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o 2� n�mero: ");
		num2 = scan.nextDouble();
		
		for (; num1<=num2; num1++) {
			
			if (num1 % 2 == 0 || num1 % 2 != 0) {
				
				inteiros = num1;
				soma += inteiros;
				System.out.println(inteiros);	
			
			}

		}		
		
		System.out.println("A soma dos n�meros �: " + soma);
		
		scan.close();
		
	}

}
