package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("[1] Álcool\n[2] Gasolina\n[3] Diesel\n[4] Fim");

		int contA = 0;
		int contG = 0;
		int contD = 0;

		while (true) {
			int opc = leia.nextInt();

			switch (opc) {
			case 1:
				contA++;
				break;
			case 2:
				contG++;
				break;
			case 3:
				contD++;
				break;
			case 4:
				System.out.println("MUITO OBRIGADO");
				System.out.println("Alcool: " + contA);
				System.out.println("Gasolina: " + contG);
				System.out.println("Disel: " + contD);
				return;
			default:
			}
			leia.close();
		}
	}

}
