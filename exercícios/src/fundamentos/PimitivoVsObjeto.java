package fundamentos;

public class PimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String s = "Algum texto"; // Existe essa forma de se criar uma string
		String nome = new String("Gabriel"); // Existe essa outra forma de se criar uma string
		s = s.toUpperCase();
		
		System.out.println(s);
		System.out.println(nome);
	}
}
