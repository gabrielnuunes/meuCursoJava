package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		int quantidadeDeNotas = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota do aluno: (ou -1 p/ sair)");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1){
				System.out.println("Nota inválida!");
			}
		}
		
		// Calcular a media
		double media = total / quantidadeDeNotas; // Neste caso estou armazendando em uma variavel o resultado da divisao do numero de notas pelo total
		System.out.printf("Média = %.2f", media);
		
		entrada.close();
	}
}
