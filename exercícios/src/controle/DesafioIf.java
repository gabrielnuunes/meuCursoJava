package controle;

public class DesafioIf {

	public static void main(String[] args) {
		double nota = 1.3;
		
		// O erro desse código está no ponto e vírgula logo após o if, fechando assim a sentença antes de executar
		if(nota >= 9.0); { 
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");
		}
	}
}
