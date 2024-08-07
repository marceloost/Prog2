package exemplos;

public class Condicional {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		int soma = a + b;
		int sub = a - b;
		int mult = a * b;
		int div = a / b;
		int resto = a % b;
		
		System.out.println("soma " + soma);
		System.out.println("subtração " + sub);
		System.out.println("multiplicação: " + mult);
		System.out.println("divisão: " + div);
		System.out.println("resto: " + resto);
		
		if(a>b) {
			System.out.println("A é maior que B");
		} else {
			System.out.println("A não é maior que B");
		}
		
		if(a>0) {
			System.out.println("A é maior do que 0");
		} else {
			System.out.println("A não é maior que 0");
		}
		
		int c = 10;
		int d = 5;
		
		if(c==10 && d==5) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não são iguais");
		}
		
		if(d != 15) {
			System.out.println("D diferente de 15");
		}
		
		boolean temp = true;
		
		if(temp) {
			System.out.println("Temp é true");
		}
		
		boolean temp2 = true;
		if(!temp2) {
			System.out.println("Temp é false");
		}
		

	}

}
