package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos converter uma temperatura de Farenheit para Celsius.\nDigite a temperatura em graus Farenheit: ");
		double farenheit = scan.nextDouble();
		
		scan.close();
		
		double celsius = (5 * ((farenheit-32)/9));
		
		System.out.println("A temperatura " + Math.round(farenheit) + " °F é igual a " + Math.round(celsius) + " °C.");
	}

}
