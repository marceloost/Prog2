package exercicios;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
//		Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
//		Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
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
