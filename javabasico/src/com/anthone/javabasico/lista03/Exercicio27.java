/**
 * 
 * @author Anthone Silva
 * 
 * 3 de out de 2018
 * 
 */
package com.anthone.javabasico.lista03;

import java.util.Scanner;

/**
 * @author Anthone Silva
 *
 */
public class Exercicio27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("DEPARTAMENTO DE METEOROLOGIA");
		
		Scanner scan = new Scanner(System.in);
		
		double temperatura, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE, totalTemperaturas = 0, media;
		int qtdeTemperaturas;
		
		System.out.println("Digite quantas temperaturas deseja informar: ");
		qtdeTemperaturas = scan.nextInt();
		
		for (int i=1; i<=qtdeTemperaturas; i++) {
			
			System.out.println("Digite a temperatura " + i + ": ");
			temperatura = scan.nextDouble();
			
			totalTemperaturas += temperatura;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}			
			
		}
		
		media = totalTemperaturas / qtdeTemperaturas;
		
		System.out.println("A maior temperatura é: " + maior);
		System.out.println("A menor temperatura é: " + menor);
		System.out.println("A média de todas as temperaturas é: " + media);
		
		scan.close();

	}

}
