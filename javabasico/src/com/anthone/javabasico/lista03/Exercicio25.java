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
public class Exercicio25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("CAIXA REGISTRADORA\n");

		Scanner scan = new Scanner(System.in);

		boolean sair = false;
		String continuar, output;
		double precoProduto = 0, totalCompra, dinheiroRecebido, troco;
		int qtdeProdutos;

		do {

			System.out.println("Deseja iniciar uma nova compra? S/N");
			continuar = scan.nextLine();

			
			if (continuar.equalsIgnoreCase("s")) {
				
				precoProduto = 0;
				totalCompra = 0;
				output = "";
				
				output += "Lojas Tabajara\n";

				System.out.println("Informe a quantidade de produtos: ");
				qtdeProdutos = scan.nextInt();
				
				for (int i=1; i<=qtdeProdutos; i++) {
					
					System.out.println("Informe o valor do produto " + i + ": ");
					precoProduto = scan.nextDouble();
					
					output += "Produto " + i + ": R$ " + precoProduto + "\n";
					totalCompra += precoProduto;					
				}
				
				output += "Total: " + totalCompra + "\n";
				
				System.out.println("Total: " + totalCompra);
				
				System.out.println("\nInforme o valor pago: ");
				dinheiroRecebido = scan.nextDouble();
				
				troco = dinheiroRecebido- totalCompra;
				
				output += "Troco: " + troco;
				
				System.out.println(output);
				
				scan.nextLine();
				
			} else {
				sair = true;
			}

		} while (!sair);

		scan.close();

	}

}
