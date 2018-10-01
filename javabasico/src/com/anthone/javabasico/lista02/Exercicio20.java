package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner	scan = new Scanner(System.in);

		System.out.println("Responda as seguintes questões: \nS = Sim\nN = Não");
		
		System.out.println("Telefonou para a vítima?");
		char pergunta1 = scan.nextLine().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char pergunta2 = scan.nextLine().charAt(0);
		
		System.out.println("Mora perto da vítima?");
		char pergunta3 = scan.nextLine().charAt(0);
		
		System.out.println("Devia para a vítima?");
		char pergunta4 = scan.nextLine().charAt(0);
		
		System.out.println("Já trabalhou com a vítima?");
		char pergunta5 = scan.nextLine().charAt(0);
		
		int contador = 0;
		
		if (pergunta1 == 's' || pergunta1 == 'S') {
			contador++; 
		}
		
		if (pergunta2 == 's' || pergunta2 == 'S') {
			contador++;
		}
		
		if (pergunta3 == 's' || pergunta3 == 'S') {
			contador++;
		}
		
		if (pergunta4 == 's' || pergunta4 == 'S') {
			contador++;
		}
		
		if (pergunta5 == 's' || pergunta5 == 'S') {
			contador++;
		}
		
		//System.out.println(contador);
		
		if (contador == 2) {
			
			System.out.println("Essa pessoa é SUSPEITA!");
			
		} else if ( contador >= 3 && contador <= 4) {
			
			System.out.println("Essa pessoa é CÚMPLICE!");
			
		} else if ( contador ==5 ) {
			
			System.out.println("Essa pessoa é ASSASSINA!");
			
		} else if ( contador < 2 ) {			
			
			System.out.println("Essa pessoa é INOCENTE!");
			
		}
		

		scan.close();
		
	}

}
