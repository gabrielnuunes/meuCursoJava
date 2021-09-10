package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		// Neste exemplo e para entender a importancia de se utilizar o equals ao inves de == para comparar strings
		
		System.out.println('2' == '2'); // Neste caso ele vai dar true por comparar duas strings
		
		String s1 = new String("2"); // Aqui foi criado uma nova string
		System.out.println("2" == s1); // Neste caso vai dar falso pois esta comparando uma string pura com uma string wrapper
		System.out.println("2".equals(s1)); // Já aqui estou comparando a string pura com o valor de dentro da string wrapper
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // Neste caso continuara dando falso pois estamos comparando string pura com wrapper
		System.out.println("2".equals(s2.trim())); // Neste caso estamos verificando a igualdade com o equals e utilizando o trim para retirar os espaços em branco
		
		entrada.close();
	}
}
