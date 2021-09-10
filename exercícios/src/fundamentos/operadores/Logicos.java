package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7; // Vai dar falso
		
		System.out.println(condicao1 && condicao2); // Operador E
		System.out.println(condicao1 || condicao2); // Operador Ou
		System.out.println(condicao1 ^ condicao2); // Operador Ou exclusivo
		System.out.println(!condicao1); // Operador de Negacao 
		System.out.println(!condicao1); // Operador de Negacao 
		
		System.out.println("Tabela Verdade com E");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);

		System.out.println("Tabela Verdade com OU");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela Verdade com XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela de Negacao");
		System.out.println(!true);
		System.out.println(!false);
	}
}
