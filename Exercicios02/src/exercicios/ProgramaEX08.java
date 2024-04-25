package exercicios;

import java.util.Scanner;

public class ProgramaEX08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Informe o valor que deseja sacar: ");
		int saque = (int) leia.nextDouble();

		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;

		nota100 = saque / 100;
		int resto100 = saque % 100;

		nota50 = resto100 / 50;
		int resto50 = resto100 % 50;

		nota20 = resto50 / 20;
		int resto20 = resto50 % 20;

		nota10 = resto20 / 10;
		int resto10 = resto20 % 10;

		nota5 = resto10 / 5;
		int resto5 = nota10 % 5;

		nota2 = resto5 / 2;
		int resto2 = resto5 % 2;

		nota1 = resto2 / 1;

		System.out.println("Quantidade de cedulasde 100: " + nota100);
		System.out.println("Quantidade de cedulasde 50: " +nota50);
		System.out.println("Quantidade de cedulasde 20: " +nota20);
		System.out.println("Quantidade de cedulasde 10: " +nota10);
		System.out.println("Quantidade de cedulasde 5: " +nota5);
		System.out.println("Quantidade de cedulasde 2: " +nota2);
		System.out.println("Quantidade de cedulasde 1: " +nota1);

		leia.close();
	}

}
