package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double fileAte5Kg = 4.9;
		double alcatraAte5Kg = 5.9;
		double picanhaAte5Kg = 6.9;
		
		double fileAcima5Kg = 5.8;
		double alcatraAcima5Kg = 6.8;
		double picanhaAcima5Kg = 7.8;
		
		double desconto = 0;
		double valorDesconto = 0;
		double precoTotal = 0;
		double precoComDesconto = 0;
		String descCarne = "";
		
		System.out.println("HIPERMERCADO TABAJARA\nPromoção de carnes:\n		Até 5kg			Acima de 5kg");
		System.out.println("1 - FILÉ 	R$ 4,90 Kg		R$ 5,80 Kg");
		System.out.println("2 - ALCATRA 	R$ 5,90 Kg		R$ 6,80 Kg");
		System.out.println("3 - PICANHA 	R$ 6,90 Kg		R$ 7,80 Kg");
		
		System.out.println("Escolha qual carne vai levar, digite 1, 2 ou 3: ");
		
		char tipoCarne = scan.nextLine().charAt(0);
		
		System.out.println("Digite quantos quilos gostaria de comprar: ");
		
		double quilos = scan.nextDouble();
		
		System.out.println("Vai pagar com o cartão Tabajara? (S - Sim ou N - Não)");
		char cartaoTabajara = scan.next().charAt(0);
		
		switch (tipoCarne) {
		case '1':
			descCarne = "Filé";
			if (quilos <= 5) {
				precoTotal = quilos * fileAte5Kg;
			} else {
				precoTotal = quilos * fileAcima5Kg;
			}			
			break;
		case '2':
			descCarne = "Alcatra";
			if (quilos <= 5) {
				precoTotal = quilos * alcatraAte5Kg;
			} else {
				precoTotal = quilos * alcatraAcima5Kg;
			}
			break;
		case '3':
			descCarne = "Picanha";
			if (quilos <= 5) {
				precoTotal = quilos * picanhaAte5Kg;
			} else {
				precoTotal = quilos * picanhaAcima5Kg;
			}
			break;
		default:
			System.out.println("Não houve compra hoje!");
			break;
		}
		
		if (cartaoTabajara == 'S' || cartaoTabajara == 's') {
			precoComDesconto = precoTotal - (precoTotal * 0.05);
			desconto = 0.05 * 100;
			valorDesconto = precoTotal * 0.05;
		} else {
			precoComDesconto = precoTotal;
			desconto = 0;
			valorDesconto = 0;
		}
		
		System.out.println("\n\nCUPOM FISCAL\n\nRESUMO DA COMPRA\n");
		System.out.println("Você comprou " + quilos + " Kg de " + descCarne + ".");
		System.out.printf("O valor total da compra foi: R$ %.2f reais", precoTotal);
		if (cartaoTabajara == 'S' || cartaoTabajara == 's') {
			System.out.printf("\nVocê pagou com o cartão Tabajara e ganhou %.2f %% de desconto, no valor de R$ %.2f reais.", desconto, valorDesconto);
		} else {
			System.out.println("\nVocê não pagou com o nosso cartão e não ganhou nosso desconto!");
		}
		System.out.printf("\nO valor total da compra é: R$ %.2f reais.", precoComDesconto);
		System.out.println("\n\nObrigado pela preferência!");
		
		scan.close();
		
	}

}
