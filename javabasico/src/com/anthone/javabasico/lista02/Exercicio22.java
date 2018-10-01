package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double quilosMorango = 0;
		double quilosMaca = 0;
		
		double quiloMorangoAte5Kg = 2.5;
		double quiloMorangoAcima5kg = 1.8;
		double quiloMacaAte5Kg = 2.2;
		double quiloMacaAcima5Kg = 1.5;
		
		double totalCompra = 0;
		
			
		System.out.println("BANCA DE FRUTAS\n1 - MORANGO\nAté 5 Kg - R$ 2,50 por quilo\nAcima de 5Kg - R$ 2,20 por quilo");
		System.out.println("2 - MAÇA\nAté 5 Kg - R$ 1,80 por quilo\nAcima de 5Kg - R$ 1,50 por quilo");
		System.out.println("\nCaso sua compra ultrapasse R$ 25,00 reais, você ganha 10% de desconto!");
		System.out.println("\nDigite quantos quilos de Morango gostaria de comprar (para nenhum, digite 0): ");
		
		quilosMorango = scan.nextDouble();
		
		System.out.println("Digite quantos quilos de Maça gostaria de comprar (para nenhum, digite 0): ");
		
		quilosMaca = scan.nextDouble();
		
		if (quilosMorango <= 5 && quilosMorango != 0) {
			totalCompra = quilosMorango * quiloMorangoAte5Kg;
		} else if (quilosMorango > 5) {
			totalCompra = quilosMorango * quiloMorangoAcima5kg;
		} else {
			System.out.println("Você não comprou morangos!");
		}
		
		if (quilosMaca <= 5 && quilosMaca != 0) {
			totalCompra = quilosMaca * quiloMacaAte5Kg;
		} else if (quilosMaca > 5) {
			totalCompra = quilosMaca * quiloMacaAcima5Kg;
		} else {
			System.out.println("Você não comprou maças!");
		}
		
		if (totalCompra > 25) {
			totalCompra = totalCompra + (totalCompra * 0.10);
		}
		
		System.out.println("Você comprou " + quilosMorango + " Kg de morango e " + quilosMaca + " Kg de maça.");
		System.out.printf("\nO total da compra é de: R$ %.2f reais.", totalCompra);
		
		if (totalCompra > 25) {
			System.out.println("\nSua compra ultrapassou R$ 25,00 reais e teve 10% de desconto!");
		}		
		
		scan.close();
	}

}
