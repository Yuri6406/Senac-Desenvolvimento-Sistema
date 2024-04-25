package exercicios;

import java.util.Scanner;

public class ProgramaEX14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---Menu---");
		System.out.println("Opeção[ 1 ]");
		System.out.println("Opeção[ 2 ]");
		System.out.println("Opeção[ 3 ]");
		int num = leia.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Você Digitou a opção 1");
			break;
		case 2:
			System.out.println("Você Digitou a opção 2");
			break;
		case 3:
			System.out.println("Você Digitou a opção 3");
			break;
		default:
			System.out.println("Opção invalida. Tente novamente");
		}
		leia.close();
	}

}
