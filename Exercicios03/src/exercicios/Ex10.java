package exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0;
		while (true) {
			int num = leia.nextInt();

			if (num >= 0) {
				soma = soma + num;
			} else {
				break;
			}
		}
		System.out.println(soma);
		leia.close();
	}

}
