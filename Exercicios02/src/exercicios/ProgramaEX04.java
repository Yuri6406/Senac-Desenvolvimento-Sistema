package exercicios;

import java.util.Scanner;

public class ProgramaEX04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome de um dia da semana: ");
		String dia = leia.next().toUpperCase();
		
		if (dia.equals("DOMINGO") || dia.equals("SABADO")) {
			System.out.println("É Final de semana");
		}else if (dia.equals("SEGUNDA")) {
			System.out.println("Não é final de semana");
		}else if (dia.equals("TERÇA")) {
			System.out.println("Não é final de semana");
		}else if (dia.equals("QUARTA")) {
			System.out.println("Não é final de semana");
		}else if (dia.equals("QUINTA")) {
			System.out.println("Não é final de semana");
		}else if (dia.equals("SEXTA")) {
			System.out.println("Não é final de semana");
		}else {
			System.out.println("Nome digitado INCORRETO");
		}
		leia.close();
	}
		
	
}
