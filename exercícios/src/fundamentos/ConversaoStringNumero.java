package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero:");
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		int num1 = Integer.parseInt(valor1);
		int num2 = Integer.parseInt(valor2);

		int somatorio = num1 + num2;
		System.out.println("A soma com inteiro �: " + somatorio);
		System.out.println("A m�dia com inteiro �: " + somatorio / 2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma � " + soma);
		System.out.println("A m�dia � " + soma / 2);
		
	}
}
