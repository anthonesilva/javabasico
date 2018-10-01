package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário a ser reajustado: ");
		double salario = scan.nextDouble();
		
		scan.close();

		double percAumento = 0;
		double valorAumento = 0;
		double salarioNovo = 0;

		
		if (salario <= 280 ) {
			salarioNovo = salario + (salario * 0.2);
			percAumento = 0.2 * 100;
			valorAumento = salario * 0.2;
		} else if (salario > 280 && salario <= 700) {
			salarioNovo = salario + (salario * 0.15);
			percAumento = 0.15 * 100;
			valorAumento = salario * 0.15;
		} else if (salario > 700 && salario <= 1500) {
			salarioNovo = salario + (salario * 0.1);
			percAumento = 0.1 * 100;
			valorAumento = salario * 0.1;
		} else if (salario > 1500) {
			salarioNovo = salario + (salario * 0.05);
			percAumento = 0.05 * 100;
			valorAumento = salario * 0.05;
		}
		
		System.out.printf("\nO salário antes do reajuste: R$ %.2f", salario);
		System.out.printf("\nO percentual de reajuste aplicado: %.2f %%", percAumento);
		System.out.printf("\nO valor do aumento é: R$ %.2f", valorAumento);
		System.out.printf("\nO novo salário é: R$ %.2f", salarioNovo);
		
	}

}
