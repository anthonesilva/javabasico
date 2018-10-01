package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular sua média anual, informe as notas: \nNota do primeiro bimestre: ");
		double bimestre1 = scan.nextDouble();
		
		System.out.println("Nota do segundo bimestre: ");
		double bimestre2 = scan.nextDouble();
		
		System.out.println("Nota do terceiro bimestre: ");
		double bimestre3 = scan.nextDouble();
		
		System.out.println("Nota do quarto bimestre: ");
		double bimestre4 = scan.nextDouble();
		
		scan.close();
		
		double media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
		
		System.out.println("\nSua média anual é: " + Math.round(media));
		
	}

}
