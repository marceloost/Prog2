package exemplos;

public class exemploWhile {

	public static void main(String[] args) {

		int i = 6;
		while(i>=0) {
			System.out.println(i);
			i-=2;
		}
		
		System.out.println("----");
		
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while(j<5);
				
		String c1 = "Feliz";
		String c2 = "Feliz";
		String c3 = "FELIZ";
		
		if(c1.equals(c2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		if(c1.equals(c3)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		
		if(c1.equalsIgnoreCase(c3)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
		

	}

}
