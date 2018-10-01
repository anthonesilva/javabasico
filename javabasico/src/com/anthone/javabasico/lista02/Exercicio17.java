package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Vamos calcular se um determinado ano é bissexto. Digite um ano (Ex: 1999): ");
		int ano = scan.nextInt();
		scan.close();

		if ((ano % 4) == 0) {
			if ((ano % 400) == 0 && (ano % 100) == 0) {
				System.out.println("É um ano bissexto!");
			} else {
				System.out.println("Não é um ano bissexto!");
			}
		} else {
			System.out.println("Não é um ano bissexto!");
		}

	}

}
