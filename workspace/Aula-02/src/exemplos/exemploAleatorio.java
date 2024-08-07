package exemplos;

import java.util.Random;

public class exemploAleatorio {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int cara = 0;
		int coroa = 0;
		for (int i = 0; i < 10; i++) {
			if(r.nextInt(2)==0) {
				cara++;
			} else {
				coroa++;
			}
			
		}
		System.out.println("Cara: " + cara);
		System.out.println("Coroa: " + coroa);

	}

}
