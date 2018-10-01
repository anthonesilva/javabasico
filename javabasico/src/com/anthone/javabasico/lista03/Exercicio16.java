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
public class Exercicio16 {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("SEQUÊNCIA DE FIBONACCI ATÉ 500\n");

		double termoNmenos1 = 0, termoNmenos2 = 1, resultado = 0;
		
		System.out.println(Math.round(termoNmenos1));
		System.out.println(Math.round(termoNmenos2));

		for (int i = 1; resultado <= 500; i++) {

			resultado = termoNmenos1 + termoNmenos2;
			termoNmenos1 = termoNmenos2;
			termoNmenos2 = resultado;
			System.out.println(Math.round(resultado));

		}

	}

}
