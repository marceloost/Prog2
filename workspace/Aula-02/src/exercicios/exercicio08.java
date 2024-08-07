package exercicios;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Faça um programa que receba dois números inteiros e imprima na tela a soma dos números
		// inteiros que estão no intervalo compreendido por eles.

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro:");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro número inteiro:");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		n1 = n1+1;
		int soma = 0;
		while(n1<n2) {
			soma += n1;
			n1++;
		}
		System.out.println(soma);
	}
}
