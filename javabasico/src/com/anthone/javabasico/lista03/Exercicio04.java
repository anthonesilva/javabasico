/**
 * 
 * @author Anthone Silva
 * 
 * 3 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {

		double populacaoA = 80000;
		double populacaoB = 200000;
		int contAnos = 0;
		
		while (populacaoA <= populacaoB) {
			
			populacaoA = populacaoA + (populacaoA * 0.03);
			populacaoB = populacaoB + (populacaoB * 0.015);
			contAnos++;
		}
		
		System.out.println("A popolução de A e B serão, respectivamente: " + Math.round(populacaoA) + " e " + Math.round(populacaoB) + " em " + contAnos + " anos.");		

	}

}
