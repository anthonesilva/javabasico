package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcule o dobro da área de um quadrado.\nDigite a medida de um dos lados: ");
		double lado = scan.nextDouble();
		
		scan.close();
		
		double area = Math.pow(lado, 2);
		
		double dobroArea = area * 2;
		
		System.out.println("A área do quadrado é: " + area + ", o dobro da área do quadrado é: " + dobroArea);
	}

}
