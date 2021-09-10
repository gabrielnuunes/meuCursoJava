package controle;

public class SwithSemBreak {
	public static void main(String[] args) {
		
		String faixa = "laranja";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o da preta");
		case "marrom":
			System.out.println("Sei o da marrom");
		case "roxa":
			System.out.println("Sei o da roxa");
		case "verde":
			System.out.println("Sei o da verde");
		case "laranja":
			System.out.println("Sei o da laranja");
		case "vermelha":
			System.out.println("Sei o da vermelha");
		case "amarela":
			System.out.println("Sei o da amarela");	
			break;
		default:
			System.out.println("Não sei nada");
		}
		
		System.out.println("Fim!");
		
		// Outro cenário
		
		int idade = 1;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe programar");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}
	}
}
