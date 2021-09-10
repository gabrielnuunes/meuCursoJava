package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; //Conversão Implicita
		System.out.println(a);
		
		float b = (float) 1.1254654654; // Conversão explicita (CAST)
		System.out.println(b);
		
		int c = 135;
		byte d = (byte) c; // Conversão explicita (CAST), de um inteiro em byte
		System.out.println(c);
		
		double e = 1.9999999;
		int f = (int) e; // Conversão explicita (CAST), de um double em um inteiro onde neste caso há perda de dados
		System.out.println(f);
	}
}
