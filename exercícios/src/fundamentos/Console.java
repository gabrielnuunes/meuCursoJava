package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom"); // Neste caso ele ira imprimir e continuara na mesma linha
		System.out.print(" dia!\n\n"); // Neste caso ele ira imprimir e continuara na mesma linha
		
		System.out.println("Bom"); // neste caso ele ira imprimir em uma linha quebrando a proxima automaticamente
		System.out.println("dia!"); // neste caso ele ira imprimir em uma linha quebrando a proxima automaticamente
		
		System.out.printf("Números da megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6); // Neste caso ele ira imprimir de forma formatada
		System.out.printf("Salário: %.1f%n", 1234.5678); // Neste caso ele ira imprimir o salario mas colocando somente uma casa  decimal apos a virgula
		System.out.printf("Nome: %s%n", "Gabriel");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Seu nome é %s %s e tem %d anos.\n", nome, sobrenome, idade);
		
		entrada.close();
	}
}
