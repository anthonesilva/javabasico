package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois n�meros, separados por espa�o: ");
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		double resultado = 0;
		
		System.out.println("Agora digite uma opera��o:\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Resto");
		int operador = scan.nextInt();
		
		scan.close();
		
		switch (operador) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("O resultado da adi��o �: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado � par!");} else { System.out.println("O resultado � �mpar");}
			if (resultado < 0) {System.out.println("O resultado � negativo!");} else { System.out.println("O resultado � positivo");}
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println("O resultado da subtra��o �: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado � par!");} else { System.out.println("O resultado � �mpar");}
			if (resultado < 0) {System.out.println("O resultado � negativo!");} else { System.out.println("O resultado � positivo");}
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println("O resultado da multiplica��o �: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado � par!");} else { System.out.println("O resultado � �mpar");}
			if (resultado < 0) {System.out.println("O resultado � negativo!");} else { System.out.println("O resultado � positivo");}
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println("O resultado da divis�o �: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado � par!");} else { System.out.println("O resultado � �mpar");}
			if (resultado < 0) {System.out.println("O resultado � negativo!");} else { System.out.println("O resultado � positivo");}
			break;
		case 5:
			resultado = numero1 % numero2;
			System.out.println("O resultado do resto �: " + resultado);
			if ((resultado % 2) == 0) { System.out.println("O resultado � par!");} else { System.out.println("O resultado � �mpar");}
			if (resultado < 0) {System.out.println("O resultado � negativo!");} else { System.out.println("O resultado � positivo");}
			break;
		default: System.out.println("N�o foi realizada nenhuma opera��o!"); break;
		}
		
	}

}
