package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		// Faça um programa que leia 2 números inteiros do teclado e que imprima na tela a soma,
		// substração, multiplicação, divisão e resto da divisão desses dois números
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int n1 = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Informe o segundo número: ");
		int n2 = Integer.parseInt(leitor.nextLine());
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int mult = n1 * n2;
		int div = n1 / n2;
		int resto = n1 % n2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		System.out.println("Resto: " + resto);

	}

}
