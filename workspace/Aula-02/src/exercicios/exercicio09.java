package exercicios;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		 // Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome
		 // do usuário, mostrando uma mensagem de erro e voltando a pedir as informações

		Scanner leitor = new Scanner(System.in);
		
		while(true) {
			System.out.print("Usuário: ");
			String usuario = leitor.nextLine();
			
			System.out.print("Senha: ");
			String senha = leitor.nextLine();
			
			if(senha.equals(usuario)) {
				System.out.println("A senha não pode ser igual ao usuario!");
			} else {
				System.out.println("Conectado!");
				break;
			}
		}
		
		
		
	}

}
