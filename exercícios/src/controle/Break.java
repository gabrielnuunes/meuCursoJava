package controle;

public class Break {
	public static void main(String[] args) { 
		
		for (int i = 0; i < 10; i++) { // Neste caso ele ir� interromper o codigo quando encontrar o 5 e ir� sair do la�o For
			if(i == 5) {
				break;
			}
			System.out.println(i); 
		}
		System.out.println("Fim!");
	}
}
