package controle;

public class DesafioIf {

	public static void main(String[] args) {
		double nota = 1.3;
		
		// O erro desse c�digo est� no ponto e v�rgula logo ap�s o if, fechando assim a senten�a antes de executar
		if(nota >= 9.0); { 
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!");
		}
	}
}
