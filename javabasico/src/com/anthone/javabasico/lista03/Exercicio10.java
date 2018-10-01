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
public class Exercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("IMPRIMINDO NÚMEROS INTEIROS DE UM INTERVALO\n");
		
		double num1, num2, inteiros;		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o 1º número: ");
		num1 = scan.nextDouble();
		
		System.out.println("Digite o 2º número: ");
		num2 = scan.nextDouble();
		
		for (; num1<=num2; num1++) {
			
			if (num1 % 2 == 0 || num1 % 2 != 0) {
				
				inteiros = num1;
				System.out.println(inteiros);	
			
			}
				
		}		
		
		scan.close();
		
	}

}
