/**
 * 
 * @author Anthone Silva
 * 
 * 3 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota = -1;
				
		do {
			
			System.out.println("Digite um n�mero de 1-10: ");
			
			try {
				nota = scan.nextDouble();			
			} catch (Exception e) {
				System.out.println(e);
			}
						
		} while (nota < 0 || nota > 10);
		
		scan.close();
		
		System.out.println("A nota informada �: " + nota);
		
	}

}
