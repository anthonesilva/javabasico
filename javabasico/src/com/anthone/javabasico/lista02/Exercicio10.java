package com.anthone.javabasico.lista02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o turno que você estuda\nM - Matutino\nV - Vespertino\nN - Noturno: ");
		char turno = scan.nextLine().charAt(0);
		
		scan.close();
		
		if (turno == 'M' || turno == 'm') {
			System.out.println("Bom dia!");
		} else if (turno == 'V' || turno == 'v') {
			System.out.println("Boa tarde!");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Turno inválido.");
		}
	}

}
