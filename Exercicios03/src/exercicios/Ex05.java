package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int rep = leia.nextInt();
		
		while (rep > 0) {
			float num1 = leia.nextInt();
			float num2 = leia.nextInt();        
			if (num2 == 0) {
				System.out.println("divisao imposivel");
			}else {
				System.out.println(num1/num2);
			}
			rep--;			
		}
		leia.close();
	}
}
