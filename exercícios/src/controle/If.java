package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		if (media < 7 && media >= 4.5) {
			System.out.println("Está de recuperação!");
		}
		if (media < 4.5 && media >= 0) {
			System.out.println("Aluno reprovado.");
		}
		
		// Outra forma de fazer a estrutura if é atribuindo a condição a uma variavel
		
		boolean criterioAprovacao = media <= 10 && media >= 7;
		boolean criterioRecuperacao = media < 7 && media >= 4.5;
		boolean criterioReprovacao = media < 4.5 && media >= 0;
		
		if (criterioAprovacao) {
			System.out.println("O aluno foi aprovado.");
		}
		if (criterioRecuperacao) {
			System.out.println("O aluno está de recuperação.");
		}
		if (criterioReprovacao) {
			System.out.println("O aluno foi reprovado.");
		}
		
		entrada.close();
	}
}
