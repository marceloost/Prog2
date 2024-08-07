package exemplos;

public class DadosPrimitivos {

	public static void main(String[] args) {
		
		// 8 tipos de dados primitivos
		// Não são classes / objetos
		
		// tipo_da_variavel = valor;
		
		// 8 bits
		byte b1 = 127;
		b1++;
		System.out.println(b1);
		
		// 16 bits
		short s1 = 200;
		System.out.println(s1);
		
		// 32 bits
		int i1 = 1000;
		System.out.println(i1);

		// 64 bits
		// na atribuição direta, o long pede a inclusão da letra l ao final
		long l1 = 10000000000l;
		System.out.println(l1);
		
		// 32 bits
		// na atribuição direta, o float pede a inclusão da lera f ao final
		float f1 = 3.1415f;
		System.out.println(f1);
		
		// 64 bits
		double d1 = 123.456789;
		System.out.println(d1);
		
		boolean b2 = true;
		boolean b3 = false;
		
		System.out.println(b2);
		System.out.println(b3);
		
		char c1 = 'a';
		char c2 = '1';
		char c3 = ' ';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		// Todos os 8 tipos de dado primitivo começam com a letra minúscula
		
		// String não é um tipo de dado primitivo
		// String é uma classe!
		String campus = "IFRS-Feliz";
		
		
		/* aqui tem
		 * um comentário
		 * de múltiplas linhas
		 */
		
		System.out.println(campus);
		
		
	}

}
