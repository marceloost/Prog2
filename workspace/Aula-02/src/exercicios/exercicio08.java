package exercicios;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Fa�a um programa que receba dois n�meros inteiros e imprima na tela a soma dos n�meros
		// inteiros que est�o no intervalo compreendido por eles.

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro:");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe outro n�mero inteiro:");
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
