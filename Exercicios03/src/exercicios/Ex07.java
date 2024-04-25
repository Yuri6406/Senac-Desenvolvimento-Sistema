package exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num = leia.nextInt();

		int res = 0;
		for (int i = 0; i < num; i++) {
			int fat = num * (num - i);
			res = res + fat;
		}
		System.out.println(res);
		leia.close();
	}
}
