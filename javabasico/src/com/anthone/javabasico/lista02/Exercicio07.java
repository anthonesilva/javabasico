package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três números diferentes separados por espaço: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		scan.close();
		
		if (numero1 < numero2 && numero1 < numero3) {
			System.out.println("O menor número é o primeiro: " + numero1);
		} else if (numero2 < numero1 && numero2 < numero3) {
			System.out.println("O menor número é o segundo: " + numero2);
		} else {
			System.out.println("O menor número é o terceiro: " + numero3);
		}
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior número é o primeiro: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior número é o segundo: " + numero2);
		} else {
			System.out.println("O maior número é o terceiro: " + numero3);
		}
	}

}
