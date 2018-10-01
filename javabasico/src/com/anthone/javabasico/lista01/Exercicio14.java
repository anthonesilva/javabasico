package com.anthone.javabasico.lista01;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcule quanto tempo sua Internet levará para baixar um arquivo.\nInforme o tamanho do arquivo em Mbytes: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Agora informe qual a velocidade da sua Internet em Mbps: ");
		double velocidadeInternet = scan.nextDouble();
		
		scan.close();
		
		double tempoSegundosDedicada = tamanhoArquivo/velocidadeInternet;
		double tempoMinutosDedicada = tempoSegundosDedicada/60;
		
		double tempoSegundosCompatilhada = tamanhoArquivo/(velocidadeInternet*0.1);
		double tempoMinutosCompartilhada = tempoSegundosCompatilhada/60;
		
		System.out.printf("Considerando que a sua Internet seja dedicada, o arquivo será baixado em %.2f minutos, aproximadamente.", tempoMinutosDedicada);
		System.out.printf("\nConsiderando que a sua Internet seja compartilhada (banda larga), o arquivo será baixado em %.2f minutos, aproximadamente.", tempoMinutosCompartilhada);
		
	}

}
