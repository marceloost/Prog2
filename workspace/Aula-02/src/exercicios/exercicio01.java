package exercicios;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
//		Crie um programa que compute o número médio de alunos por turma. Para tal, leia do teclado o
//		número de turmas e o número de alunos em cada turma. Nenhuma turma pode ter mais de 32
//		alunos! Se o usuário informar que uma turma tem mais de 32 alunos, pergunte novamente
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o número de turmas: ");
		int nt = Integer.parseInt(leitor.nextLine());
		
		int i = 1;
		while(i<=nt) {
			System.out.print("Informe o número de alunos da turma " + i + ": ");
			int na = Integer.parseInt(leitor.nextLine());
			if(na > 32) {
				System.out.println("Número máximo de alunos por turma é de 32 alunos!");
				continue;
			}
			i++;
		}
		
		

	}

}
