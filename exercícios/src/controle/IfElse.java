package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número: ");
		
		int numero = Integer.parseInt(valor); 
		// Neste caso estou atribuindo a uma variavel o valor 
		//inserido em valor, e passando ele para inteiro por garantia
		
		if(numero % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é ímpar!");
		}
	}
}
