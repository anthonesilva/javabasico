package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcule a �rea de um c�rculo.\nDigite o raio: ");
		double raio = scan.nextDouble();
		
		scan.close();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("O �rea do c�rculo de raio " + raio + ", � igual a: " + area);
	}

}
