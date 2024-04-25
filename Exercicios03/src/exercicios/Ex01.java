package exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int senha = 2002;

		while (true) {
			System.out.println("Insira sua senha de 4 digitos: ");
			int leiSenha = leia.nextInt();
			if (senha == leiSenha) {
				System.out.println("Acesso permitido");
				break;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		leia.close();
	}
}
