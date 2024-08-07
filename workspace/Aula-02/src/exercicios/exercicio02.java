package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
//		Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
//		Um número primo é aquele que é divisível somente por ele mesmo e por 1.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = Integer.parseInt(leitor.nextLine());
		
		boolean primo = true;
		
		for (int i = 2; i < n; i++) {
			int teste = n % i;
			if(teste == 0) {
				primo = false;
				break;
			}
		}
		System.out.println(primo);
			
		

	}

}
