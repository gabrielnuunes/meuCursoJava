package controle;

public class Break {
	public static void main(String[] args) { 
		
		for (int i = 0; i < 10; i++) { // Neste caso ele irá interromper o codigo quando encontrar o 5 e irá sair do laço For
			if(i == 5) {
				break;
			}
			System.out.println(i); 
		}
		System.out.println("Fim!");
	}
}
