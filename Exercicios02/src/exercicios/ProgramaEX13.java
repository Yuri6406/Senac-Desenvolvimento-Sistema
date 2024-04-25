package exercicios;

import java.util.Scanner;

public class ProgramaEX13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 a 10: ");
		int nota = leia.nextInt();
		
		switch (nota) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
			
		default:
			System.out.println("F");
			break;
		}
		leia.close();
	}

}
