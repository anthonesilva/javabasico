package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = scan.nextInt();
		
		scan.close();
		
		if ((numero % 2) == 0) {
			System.out.println("N�mero par!");
		} else {
			System.out.println("N�mero �mpar!");
		}
		
	}

}
