package com.anthone.javabasico.lista02;

import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um sexo (M-F): ");
		char sexo = scan.next().charAt(0);
		
		scan.close();
		
		if (sexo == 'f' || sexo == 'F') {
			System.out.println("O sexo é feminino!");
		} else if (sexo == 'm' || sexo == 'M') {
			System.out.println("O sexo é masculino!");
		} else {
			System.out.println("Sexo inválido.");
		}
		
	}

}
