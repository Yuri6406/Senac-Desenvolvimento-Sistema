package exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
			
			
		while (true) {
			System.out.println("---Sistema cartesiano---");
			
			System.out.println("Digite o valor de X: ");
			int x = leia.nextInt();
			System.out.println("Digite o valor de y:");
			int y = leia.nextInt();

			if (x > 0 && y > 0){
				System.out.println("primeiro");				
			}else if (x < 0 && y > 0){
				System.out.println("segundp");
			}else if (x < 0 && y < 0) {
				System.out.println("terceira");
			}else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}else {
				break;
			}
		}
		leia.close();
		
		
		
		
	}

}
