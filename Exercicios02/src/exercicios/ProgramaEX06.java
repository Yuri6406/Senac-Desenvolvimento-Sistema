package exercicios;

public class ProgramaEX06 {

	public static void main(String[] args) {

		double nota1 = 7, nota2 = 7, nota3 = 7;
		
		double media = ((nota1 + nota2 + nota3)/3);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		System.out.println("A média do aluno é " + media);
	}

}
