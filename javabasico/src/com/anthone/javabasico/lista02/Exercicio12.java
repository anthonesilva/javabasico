package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor/hora trabalhada (R$): ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite a quantidade de horas trabalhadas por mês: ");
		double qtdeHorasMes = scan.nextDouble();
		
		scan.close();
		
		double salario = valorHora * qtdeHorasMes;
		double salarioLiquido = 0;
		double percIR = 0;
		double percINSS = 0.10 * 100;
		double percFGTS = 0.11 * 100;
		double valorIR = 0;
		double valorINSS = salario * 0.10;
		double valorFGTS = salario * 0.11;
		double totalDescontos = 0;
		
		if (salario <= 900) {
			percIR = 0;
			valorIR = 0;
		} else if (salario > 900 && salario <= 1500) {
			percIR = 0.05 * 100;
			valorIR = salario * 0.05;
		} else if (salario > 1500 && salario <= 2500) {
			percIR = 0.10 * 100;
			valorIR = salario * 0.10;
		} else if (salario > 2500) {
			percIR = 0.20 * 100;
			valorIR = salario * 0.20;
		} else {
			System.out.println("Salário inválido!");
		}
		
		salarioLiquido = salario - valorIR - valorINSS;
		totalDescontos = valorIR + valorINSS + valorFGTS;
		
		System.out.printf("\nO salário bruto é: %.2f", salario);
		System.out.printf("\n( - ) IR (%.0f %%): %.2f", percIR, valorIR);
		System.out.printf("\n( - ) INSS (%.0f %%): %.2f", percINSS, valorINSS);
		System.out.printf("\nFGTS (%.0f %%): %.2f", percFGTS, valorFGTS);
		System.out.printf("\nTotal de descontos: %.2f", totalDescontos);
		System.out.printf("\nSalário líquido: %.2f", salarioLiquido);
		
	}

}
