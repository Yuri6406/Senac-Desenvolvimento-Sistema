package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num = leia.nextInt();

		for (int i = 0; i < num; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		leia.close();
	}
}
