package exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num = leia.nextInt();

		int contD = 0;
		int contF = 0;
		for (int i = 0; i < num; i++) {
			int n = leia.nextInt();
			if (n >= 10 && n <= 20) {
				contD++;
			} else {
				contF++;
			}
		}
		System.out.println(contD + " in");
		System.out.println(contF + " Out");
		leia.close();
	}

}
