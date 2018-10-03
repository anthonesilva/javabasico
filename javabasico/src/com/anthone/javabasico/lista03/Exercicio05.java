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
public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double populacaoA = 0;
		double populacaoB = 0;
		int contAnos = 0;
		int decisao = 0;
		boolean desejaContinuar = false;
		
		do {
			
			do {
				
				System.out.println("Informe a popula��o de A: ");
				populacaoA = scan.nextDouble();
				scan.nextLine();
				
				if (populacaoA <= 0) {
					System.out.println("A popula��o deve ser maior que 0. Tente novamente!");
					populacaoA = 0;
				}
				
			} while (populacaoA == 0);
			
			do {
				
				System.out.println("Informe a popula��o de B: ");
				populacaoB = scan.nextDouble();
				scan.nextLine();
				
				if (populacaoB <= 0) {
					System.out.println("A popula��o deve ser maior que 0. Tente novamente!");
					populacaoB = 0;
				}
				
			} while (populacaoB == 0);
			
			while (populacaoA <= populacaoB) {
				
				populacaoA = populacaoA + (populacaoA * 0.03);
				populacaoB = populacaoB + (populacaoB * 0.015);
				contAnos++;
			}
			
			System.out.println("A popolu��o de A e B ser�o, respectivamente: " + Math.round(populacaoA) + " e " + Math.round(populacaoB) + " em " + contAnos + " anos.");		
			
			do {
				
				System.out.println("\nDeseja calcular novamente?\n1 - Sim\n0 - N�o\nDigite um valor: ");
				decisao = scan.nextInt();
				scan.nextLine();
				if (decisao == 1) {
					desejaContinuar = true;
				} else if (decisao == 0) {
					desejaContinuar = false;
				} else {
					System.out.println("Op��o inv�lida! Tente novamente!\n");
				}
			
			} while (decisao != 0 && decisao != 1);
			
		} while (desejaContinuar == true);		
		
		System.out.println("\nAt� mais!");
		scan.close();
	}

}
