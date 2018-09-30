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
		
		System.out.println("MAIOR NÚMERO\nDigite 5 números, separados por espaço e pressione [ENTER]: ");
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		double num4 = scan.nextDouble();
		double num5 = scan.nextDouble();
		
		double maior = 0;
		
		do {
			if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
				maior = num1;
			} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
				maior = num2;
			} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
				maior = num3;
			} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
				maior = num4;
			} else {
				maior = num5;
			}
			
		} while (maior < 0);
		
		System.out.println("O número maior é o: " + maior);
		
		scan.close();
		
	}

}
