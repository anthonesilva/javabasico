package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("POSTO DE COMBUSTÍVEL\nA - Álcool - R$ 1,90/litro\nG - Gasolina - R$ 2,50/litro");
		
		System.out.println("Digite o tipo do combustível: ");
		char combustivel = scan.nextLine().charAt(0);
		
		System.out.println("Digite a quantidade de litros que gostaria de abastecer: ");
		double litros = scan.nextDouble();
		
		double precoAlcool = 1.90;
		double precoGasolina = 2.50;
		double desconto = 0;
		double precoFinal = 0;
		String descCombustivel = "";
		
		if (litros <= 20) {
			if (combustivel == 'a' || combustivel == 'A') {
				precoAlcool = precoAlcool - (precoAlcool * 0.03);
				precoFinal = litros * precoAlcool;
				desconto = 0.03 * 100;
			} else if (combustivel == 'g' || combustivel == 'G') {
				precoGasolina = precoGasolina - (precoGasolina * 0.04);
				precoFinal = litros * precoGasolina;
				desconto = 0.04 * 100;
			} else {
				System.out.println("Houve algo errado! Tente novamente!");
			}
		} else if (litros > 20) {
			if (combustivel == 'a' || combustivel == 'A') {
				precoAlcool = precoAlcool - (precoAlcool * 0.05);
				precoFinal = litros * precoAlcool;
				desconto = 0.05 * 100;
			} else if (combustivel == 'g' || combustivel == 'G') {
				precoGasolina = precoGasolina - (precoGasolina * 0.06);
				precoFinal = litros * precoGasolina;
				desconto = 0.06 * 100;
			} else {
				System.out.println("Houve algo errado! Tente novamente!");
			}
		} else {
			System.out.println("Houve algo errado! Tente novamente!");
		}
		
		if (combustivel == 'a' || combustivel == 'A') {
			descCombustivel = "Àlcool";
			System.out.println("Você colocou " + litros + " litros de " + descCombustivel + ".");
			System.out.printf("Ganhou %.0f %% de desconto, pagando R$ %.2f reais por litro.", desconto, precoAlcool);
			System.out.printf("\nO valor final é: R$ %.2f reais", precoFinal);
		} else if (combustivel == 'g' || combustivel == 'G') {
			descCombustivel = "Gasolina";
			System.out.println("Você colocou " + litros + " litros de " + descCombustivel + ".");
			System.out.printf("Ganhou %.0f %% de desconto, pagando R$ %.2f reais por litro.", desconto, precoGasolina);
			System.out.printf("\nO valor final é: R$ %.2f reais", precoFinal);
		} else {
			System.out.println("Houve algo errado! Tente novamente!");
		}		
		
		scan.close();
	}

}
