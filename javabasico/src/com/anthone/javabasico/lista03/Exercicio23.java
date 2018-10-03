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
public class Exercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("LOJAS QUASE DOIS\n");
		
		Scanner scan = new Scanner(System.in);
		
		int quantidadeItens;
		double valorItens = 0;
		double valorConta = 0;
		
		System.out.println("Digite a quantidade de itens que o cliente irá levar: ");
		quantidadeItens = scan.nextInt();
		
		for (int i=1; i<=50; i++) {
			valorItens = i * 1.99;
			System.out.println(i + " item(ns) - R$ " + valorItens);			
		}
		
		valorConta = quantidadeItens * 1.99;
		
		System.out.println("\nDe acordo com a tabela, a conta foi: R$ " + valorConta);		
		
		scan.close();

	}

}
