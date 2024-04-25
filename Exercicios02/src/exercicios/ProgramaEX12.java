package exercicios;

import java.util.Scanner;

public class ProgramaEX12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o primeiro número");
		int num1 = leia.nextInt();

		System.out.println("Digite o primeiro número");
		int num2 = leia.nextInt();

		if (num1 > num2) {
			int maior = num1;
			System.out.println("Entre " + num1 + " e " + num2 + " o maior número é " + maior);
		}else if (num2 > num1) {
			int maior = num2;
			System.out.println("Entre " + num1 + " e " + num2 + " o maior número é " + maior);
		}
		leia.close();
	}

}
