package exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		// Escreva um programa que l� um n�mero do teclado e que determine se ele � par ou impar
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		if(n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("�mpar");
		}

	}

}
