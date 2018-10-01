package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o que está sendo solicitado:\nDigite um número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Digite outro número: ");
		double numero2 = scan.nextDouble();
		
		scan.close();
		
		if (numero1 > numero2) {
			System.out.println("O número maior é o primeiro informado: " + numero1);
		} else {
			System.out.println("O número maior é o segundo informado: " + numero2);
		}
	}

}
