package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as notas.\nPrimeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Segunda nota: ");
		double nota2 = scan.nextDouble();
		
		scan.close();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		if (media < 7) {
			System.out.println("Reprovado!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Aprovado com distinção!");
		}
	}

}
