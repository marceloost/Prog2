package exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		// Faça um programa que leia 2 números inteiros do teclado e que imprima se os números são iguais
		// ou diferentes. Caso sejam diferentes, imprima o maior deles apenas
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro número: ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		if(n1!=n2) {
			if(n1>n2) {
				System.out.println(n1 + " é maior");
			} else {
				System.out.println(n2 + " é maior");
			}
		} else {
			System.out.println(n1 + " e " + n2 + " são iguais");
		}

	}

}
