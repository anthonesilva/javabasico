package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe tr�s n�meros separados por espa�o: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		scan.close();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior n�mero � o primeiro: " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O maior n�mero � o segundo: " + numero2);
		} else {
			System.out.println("O maior n�mero � o terceiro: " + numero3);
		}
		
	}

}
