package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		 // Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome
		 // do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es

		Scanner leitor = new Scanner(System.in);
		
		while(true) {
			System.out.print("Usu�rio: ");
			String usuario = leitor.nextLine();
			
			System.out.print("Senha: ");
			String senha = leitor.nextLine();
			
			if(senha.equals(usuario)) {
				System.out.println("A senha n�o pode ser igual ao usuario!");
			} else {
				System.out.println("Conectado!");
				break;
			}
		}
		
		
		
	}

}
