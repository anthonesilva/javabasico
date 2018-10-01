package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = scan.nextDouble();
		scan.close();
		
		if (numero >= 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
		}
	}

}
