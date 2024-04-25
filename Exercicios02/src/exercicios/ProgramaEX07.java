package exercicios;

import java.util.Scanner;


public class ProgramaEX07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma letra do alfabeto: ");
		String letra = leia.nextLine().toUpperCase();

		String vogal = "AEIOU";

		if (vogal.contains(letra)) {
			System.out.println("A letra digitada é uma vogal");
		} else {
			System.out.println("A letra digitada é uma consoante");
		}
		
		leia.close();
	}

}
