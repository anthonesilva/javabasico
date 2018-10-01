package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe 3 valores separados por espaço, vamos calcular se pode ser um triângulo: ");
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		scan.close();
		
		if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado1 + lado3) > lado2) {
			
			if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
				System.out.println("É um triângulo equilátero!");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("É um triângulo isósceles!");
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("É um triângulo escaleno!");
			} else {
				System.out.println("Esse triângulo não tem classificação ainda!");
			}
			
		} else {
			System.out.println("Não é um triângulo!");
		}
	}

}
