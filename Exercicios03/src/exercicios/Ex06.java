package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num = leia.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}
		leia.close();
	}

}
