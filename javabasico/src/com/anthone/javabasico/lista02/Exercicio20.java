package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner	scan = new Scanner(System.in);

		System.out.println("Responda as seguintes quest�es: \nS = Sim\nN = N�o");
		
		System.out.println("Telefonou para a v�tima?");
		char pergunta1 = scan.nextLine().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char pergunta2 = scan.nextLine().charAt(0);
		
		System.out.println("Mora perto da v�tima?");
		char pergunta3 = scan.nextLine().charAt(0);
		
		System.out.println("Devia para a v�tima?");
		char pergunta4 = scan.nextLine().charAt(0);
		
		System.out.println("J� trabalhou com a v�tima?");
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
			
			System.out.println("Essa pessoa � SUSPEITA!");
			
		} else if ( contador >= 3 && contador <= 4) {
			
			System.out.println("Essa pessoa � C�MPLICE!");
			
		} else if ( contador ==5 ) {
			
			System.out.println("Essa pessoa � ASSASSINA!");
			
		} else if ( contador < 2 ) {			
			
			System.out.println("Essa pessoa � INOCENTE!");
			
		}
		

		scan.close();
		
	}

}
