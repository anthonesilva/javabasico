package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vamos calcular o seu sal�rio?\nDigite o quanto voc� ganha por hora: ");
		double horaTrabalhadaValor = scan.nextDouble();
		
		System.out.println("Agora digite as horas trabalhadas no m�s: ");
		double qtdeHorasTrabalhadas = scan.nextDouble();
		
		scan.close();
		
		double salarioMes = horaTrabalhadaValor * qtdeHorasTrabalhadas;
		
		System.out.println("O seu sal�rio do m�s �: R$ " + salarioMes);
	}

}
