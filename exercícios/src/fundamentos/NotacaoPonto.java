package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		s = s.concat("!!!");
		
		String g = "gabriel".toUpperCase(); // Neste caso ja estou passando o valor da variavel, e passando para caixa alta
		System.out.println(g);
		System.out.println(s);
		
		String y = "Bom dia X".replace("X", "Gabriel").toUpperCase().concat(" Nunes");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador ponto "."
		int a = 3;
		System.out.println(a);
		
	}
	
}
