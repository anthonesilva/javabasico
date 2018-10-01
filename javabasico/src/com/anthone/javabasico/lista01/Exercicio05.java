package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Converta metros em centímetros.\nDigite uma metragem: ");
		double metros = scan.nextDouble();
		
		scan.close();
		
		double centimetros = metros * 100;
		
		System.out.println("A medida de " + metros + " metros, convertida em centímetros é: " + Math.round(centimetros) + " centímetros!");
	}

}
