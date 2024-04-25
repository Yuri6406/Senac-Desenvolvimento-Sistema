package exercicios;

import java.util.Random;

public class ProgramaEX09 {

	public static void main(String[] args) {
		
		
		Random aleatorio = new Random();
		
		int dado1 = aleatorio.nextInt(1,6);
		int dado2 = aleatorio.nextInt(1,6);
		
		int soma = dado1 + dado2;
		
		if (soma == 7 || soma == 11) {
			System.out.println("O valor do primeiro dado foi " + dado1+ " e o segundo " + dado2 + ". Você ganhou!!!");			
		}else if (soma == 2 || soma == 3 || soma == 12) {
			System.out.println("O valor do primeiro dado foi " + dado1 + "e o segundo " + dado2 + ". Você perdeu!!!");
		}else {
			System.out.println("Jogue os dados novamente");
		}
		
		
	}

}
