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
public class Exercicio26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CALCULANDO FATORIAL\n");
		
		Scanner scan = new Scanner(System.in);
		
		String output;
		int numero, fatorial = 1;
		
		System.out.println("Informe o número que deseja calcular fatorial: ");
		numero = scan.nextInt();
		
		output = "Fatorial de: " + numero + "\n";
		output += numero + "! = ";
		
		for(int i=numero; i>0; i--) {
		
			
			fatorial = i*fatorial;
			
			if (i-1 == 0) {
				output += i + " = ";
			} else {
				output += i + " . ";
			}

		}
		
		output += fatorial + "";
		System.out.println(output);
		
		scan.close();

	}

}
