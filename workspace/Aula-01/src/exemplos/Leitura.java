package exemplos;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Ol� " + nome);
		System.out.println("Voc� tem " + idade + " anos.");

	}

}
