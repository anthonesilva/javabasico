package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois números, separados por espaço: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double resultado = 0;
		
		System.out.println("Agora digite uma operação:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Resto");
		int operador = scan.nextInt();
		
		scan.close();
		
		switch (operador) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("O resultado da adição é: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado é par!");} else { System.out.println("O resultado é ímpar");}
			if (resultado < 0) {System.out.println("O resultado é negativo!");} else { System.out.println("O resultado é positivo");}
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("O resultado da subtração é: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado é par!");} else { System.out.println("O resultado é ímpar");}
			if (resultado < 0) {System.out.println("O resultado é negativo!");} else { System.out.println("O resultado é positivo");}
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("O resultado da multiplicação é: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado é par!");} else { System.out.println("O resultado é ímpar");}
			if (resultado < 0) {System.out.println("O resultado é negativo!");} else { System.out.println("O resultado é positivo");}
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println("O resultado da divisão é: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado é par!");} else { System.out.println("O resultado é ímpar");}
			if (resultado < 0) {System.out.println("O resultado é negativo!");} else { System.out.println("O resultado é positivo");}
			break;
		case 5:
			resultado = numero1 % numero2;
			System.out.println("O resultado do resto é: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado é par!");} else { System.out.println("O resultado é ímpar");}
			if (resultado < 0) {System.out.println("O resultado é negativo!");} else { System.out.println("O resultado é positivo");}
			break;
		default: System.out.println("Não foi realizada nenhuma operação!"); break;
		}
		
	}

}
