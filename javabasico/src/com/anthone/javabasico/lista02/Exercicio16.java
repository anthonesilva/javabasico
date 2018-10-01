package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para calcular uma equação do segundo grau (Ax² + Bx + C), informe os itens a seguir: ");
		System.out.println("Informe o valor de A: ");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.println("O valor de A não pode ser zero. Não é uma equação do segundo grau!\nComece com outra equação!");
		} else {
			System.out.println("Informe o valor de B: ");
			double b = scan.nextDouble();
			
			System.out.println("Informe o valor de C: ");
			double c = scan.nextDouble();
			
			double delta = ((b*b)) + (4*a*c);
			
			if (delta < 0) {
				
				System.out.println("A equação não possui raízes reais, pois o valor de delta é negativo: " + delta);
				System.out.println("Comece novamente com outra equação.");
			
			} else if (delta == 0) {
			
				double x1 = ((-1 * (b*b) + Math.sqrt(delta))/(2*a));
				double x2 = ((-1 * (b*b) - Math.sqrt(delta))/(2*a));
				
				System.out.println("O valor de delta é igual a 0, portanto, a raiz real é: " + x1);
				System.out.println("\nX1 = " + x1 + "\nX2 = " + x2);
				
			} else {
				
				double x1 = ((-1 * (b*b) + Math.sqrt(delta))/(2*a));
				double x2 = ((-1 * (b*b) - Math.sqrt(delta))/(2*a));
				
				System.out.println("O valor de delta é positivo, portanto, possui duas raízes reais que são: ");
				System.out.println("\nX1 = " + x1 + "\nX2 = " + x2);
				
			}
			
		}
		
		scan.close();
		
	}

}
