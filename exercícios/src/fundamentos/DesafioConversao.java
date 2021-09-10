package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		/*
		 * O desafio consiste em pegar os tres ultimos salarios de um usuario e mostrar a media no final, mas recebendo como string e convertendo as strigs
		 * em number de forma que se consiga fazer a soma e a divisao no final, lembrando que o usuário poderá colocar virgula ou ponto nas casas decimais.
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.println("Digite o terceiro salario: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);

		System.out.println("A média dos três últimos salários é: " + (valor1 + valor2 + valor3) / 3);
		
		entrada.close();
	}
}
