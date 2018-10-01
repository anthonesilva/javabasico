package com.anthone.javabasico.lista03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota = -1;
				
		do {
			
			System.out.println("Digite um número de 1-10: ");
			
			//System.out.println(System.in.toString());
			
			
			try {
				nota = scan.nextDouble();			
			} catch (Exception e) {
				System.out.println(e);
			}
			
			/*
			try {
				scan.remove();
			} catch (Exception ex) {
				// TODO: handle exception
				System.out.println(ex);
			}
			*/
			
			//nota = 1;
			
		} while (nota < 0 || nota > 10);
		
		scan.close();
		
		System.out.println("A nota informada é: " + nota);
		
	}

}
