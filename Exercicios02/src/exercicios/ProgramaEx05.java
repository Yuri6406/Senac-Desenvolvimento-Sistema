package exercicios;

import java.util.Scanner;

public class ProgramaEx05 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o 1° número: ");		
		int num1 = leia.nextInt();
		
		System.out.println("Digite o 2° número: ");
		int num2 = leia.nextInt();
		
		System.out.println("Digite o 3° número: ");
		int num3 = leia.nextInt();
		
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número digitado foi " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("O mair número digitado foi " + num2);			
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("O maior número digitado foi " + num3);
		}
		
		leia.close();
	}
}
