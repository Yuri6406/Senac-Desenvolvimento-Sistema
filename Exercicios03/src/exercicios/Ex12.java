package exercicios;

public class Ex12 {

	public static void main(String[] args) {

		String palavra = "Minha palavra";

		char letra = 'a';

		int cont = 0;
		for (int i = 0; i < palavra.length(); i++) {
			if (letra == palavra.charAt(i)) {
				cont++;
			}
		}
		System.out.println(cont);
	}
}
