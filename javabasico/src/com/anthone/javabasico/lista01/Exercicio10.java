package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos converter uma temperatura de Celsius para Farenheit.\nDigite a temperatura em graus Celsius: ");
		double celsius = scan.nextDouble();
		
		scan.close();
		
		double farenheit = (((celsius/5)*9)+32);
		
		System.out.println("A temperatura " + Math.round(celsius) + " °C é igual a " + Math.round(farenheit) + " °F.");
	}

}
