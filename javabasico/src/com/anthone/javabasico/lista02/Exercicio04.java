package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma letra: ");
		char letra = scan.next().charAt(0);

		scan.close();

		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o'
				|| letra == 'O' || letra == 'u' || letra == 'U') {
			System.out.println("A letra é uma vogal!");
		} else if (letra <= '9' && letra >= '0') {
			System.out.println("É um número!");
		} else {
			System.out.println("É uma consoante!");
		}

	}

}
