package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terca (V ou F)
		// Trabalho na quinta (V ou F)
		
		//Caso os dois trabalhos deem certo ira comprar tv de 50, caso somente um dos dois deem certo comprara tv de 32, caso os dois, ou um dos dois trabalhos
		// der certo ira tomar sorvete, caso nenhum dos trabalhos de certo nao comprara nem as tv e nem tomarao sorvete
		
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou sorvete ? " + comprouSorvete);
		System.out.println("Mais saudável\"? " + maisSaudavel);
	}
}
