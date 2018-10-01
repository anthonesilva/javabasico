package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu salário bruto e líquido.\nInforme quanto você ganha por hora em R$: ");
		double ganhoPorHora = scan.nextDouble();
		
		System.out.println("Agora digite quantas horas trabalha por mês: ");
		double horasMes = scan.nextDouble();
		
		scan.close();
		
		double salarioBruto = ganhoPorHora * horasMes;
		
		double impostoRenda = salarioBruto * 0.11;
		double previdencia = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		
		double salarioLiquido = salarioBruto - impostoRenda - previdencia - sindicato;
		
		System.out.printf("\nO seu salário bruto é: R$ %.2f", salarioBruto);
		System.out.printf("\nO desconto de 11%% do imposto de renda é igual a: R$ %.2f", impostoRenda);
		System.out.printf("\nO desconto de 8%% do INSS é igual a: R$ %.2f", previdencia);
		System.out.printf("\nO desconte de 5%% do sindicato é igual a: R$ %.2f", sindicato);
		System.out.printf("\nSeu salário bruto é: R$ %.2f", salarioLiquido);
		
	}

}
