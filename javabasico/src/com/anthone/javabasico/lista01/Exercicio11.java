package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os n�meros solicitados a seguir.\nDigite um n�mero inteiro (sem casas decimais): ");
		int primeiroInt = scan.nextInt();
		
		System.out.println("Digite mais um inteiro (sem casas decimais): ");
		int segundoInt = scan.nextInt();
		
		System.out.println("Digite um n�mero real (com casas decimais): ");
		double terceiroDouble = scan.nextDouble();
		
		scan.close();
		
		double dobroPrimeiroMetadeSegundo = (primeiroInt*2) + (segundoInt/2);
		double somaTriploPrimeiroComTerceiro = (primeiroInt*3) + terceiroDouble;
		double terceiroAoCubo = Math.pow(terceiroDouble, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + dobroPrimeiroMetadeSegundo);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + somaTriploPrimeiroComTerceiro);
		System.out.println("O terceiro elevado ao cubo: " + terceiroAoCubo);
	}

}
