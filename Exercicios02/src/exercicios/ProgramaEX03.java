package exercicios;

public class ProgramaEX03 {

	public static void main(String[] args) {

		int num = 100;

		if (num >= 0 && num <= 100) {
			if (num <= 25) {
				System.out.println("O número está no intervalo de [0,25]");
			} else if (num <= 50) {
				System.out.println("O número está no intervalo de [25,50]");
			} else if (num <= 75) {
				System.out.println("O número está no intervalo de [50,75]");
			} else if (num <= 100) {
				System.out.println("O número está no intervalo de [75,100]");
			}
		} else {
			System.out.println("O número está fora de intevalo");
		}
	}
}