package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos fazer uma soma! \nDigite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		int resultado = numero1 + numero2;
		System.out.println("A soma dos números é: " + resultado);
		scan.close();
	}

}
