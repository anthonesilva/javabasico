/**
 * 
 * @author Anthone Silva
 * 
 * 2 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("� N�MERO PRIMO?\n");

		Scanner scan = new Scanner(System.in);

		double numero;
		int contPrimo = 0, contNaoPrimo = 0;
		
		System.out.println("Digite um n�mero: ");
		numero = scan.nextDouble();

		for (int i = 1; i <= numero; i++) {
			if (numero != 1) {
				if ((numero / i == 1 || numero / i == numero) || (numero % i != 0)) {
					contPrimo++;
				} else if (numero % i == 0) {
					contNaoPrimo++;
				}
			} else {
				contNaoPrimo+=1;
			}
		}

		if (contPrimo > 0 && contNaoPrimo == 0) {
			System.out.println("� n�mero primo!");
		} else {
			System.out.println("N�o � n�mero primo!");
		}

		scan.close();

	}

}
