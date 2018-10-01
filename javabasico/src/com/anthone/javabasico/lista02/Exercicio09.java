package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três números diferentes separados por espaço: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double numero3 = scan.nextDouble();
		
		scan.close();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println(numero1);
			if (numero2 > numero3 ) {
				System.out.println(numero2);
				System.out.println(numero3);
			} else {
				System.out.println(numero3);
				System.out.println(numero2);
			}
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2);
			if (numero1 > numero3) {
				System.out.println(numero1);
				System.out.println(numero3);
			} else {
				System.out.println(numero3);
				System.out.println(numero1);
			}
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println(numero3);
			if (numero1 > numero2) {
				System.out.println(numero1);
				System.out.println(numero2);
			} else {
				System.out.println(numero2);
				System.out.println(numero1);
			}
		}
		
	}

}
