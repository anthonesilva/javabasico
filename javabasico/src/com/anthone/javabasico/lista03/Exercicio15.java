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
public class Exercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("SEQUÊNCIA DE FIBONACCI\n");
		
		double enesimoTermo, termoNmenos1 = 1, termoNmenos2 = 1, resultado = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o enésimo termo da sequência (até que número deseja que a sequência seja calculada): ");
		enesimoTermo = scan.nextDouble();
		
		System.out.println(Math.round(termoNmenos1));
		System.out.println(Math.round(termoNmenos2));
		
		for (int i=1; i<=enesimoTermo; i++) {
			
			resultado = termoNmenos1 + termoNmenos2;
			termoNmenos1 = termoNmenos2;
			termoNmenos2 = resultado;
			System.out.println(Math.round(resultado));
						
		}
		
		scan.close();

	}

}
