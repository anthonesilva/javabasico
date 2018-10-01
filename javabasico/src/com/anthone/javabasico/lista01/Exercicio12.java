package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular seu peso ideal!?\nDigite sua altura: ");
		double altura = scan.nextDouble();
		
		scan.close();
		
		double pesoideal = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal de acordo com a sua altura é: " + pesoideal);
	}

}
