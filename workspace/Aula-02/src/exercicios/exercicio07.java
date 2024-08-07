package exercicios;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		// Faça um programa que receba dois números inteiros e gere os números inteiros que estão no
		// intervalo compreendido por eles. 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro:");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro número inteiro:");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		n1 = n1+1;
		while(n1<n2) {
			System.out.println(n1);
			n1++;
		}

	}

}
