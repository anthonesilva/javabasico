package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu salário?\nDigite o quanto você ganha por hora: ");
		double horaTrabalhadaValor = scan.nextDouble();
		
		System.out.println("Agora digite as horas trabalhadas no mês: ");
		double qtdeHorasTrabalhadas = scan.nextDouble();
		
		scan.close();
		
		double salarioMes = horaTrabalhadaValor * qtdeHorasTrabalhadas;
		
		System.out.println("O seu salário do mês é: R$ " + salarioMes);
	}

}
