package exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		// Escreva um programa que lê um número do teclado e que determine se ele é par ou impar
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		if(n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}

	}

}
