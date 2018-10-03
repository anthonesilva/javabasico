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
public class Exercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Preço do pão: R$ 0,18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		double valor;
		
		for(int i=1; i<=50; i++) {
			
			valor = i * 0.18;
			
			System.out.println(i + " - R$ " + valor);
		}

	}

}
