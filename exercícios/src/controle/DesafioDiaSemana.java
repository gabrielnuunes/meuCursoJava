package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print(" 1- Domingo\n 2- Segunda\n 3- Ter�a\n 4- Quarta \n 5- Quinta\n 6- Sexta\n 7- S�bado \n Informe o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("Ter�a")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("S�bado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inv�lido");
		}
		
		// Outra forma de verificar o dia � 
		//  if("Domingo".equalsIgnoreCase(dia)) { // Comparando primeiro o domingo com o dia
		//  	System.out.println(1);
	    //}
		
		entrada.close();
	}
}
