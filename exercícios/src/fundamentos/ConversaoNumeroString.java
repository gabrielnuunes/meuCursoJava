package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000; // Aqui declarei um inteiro em wrapper
		System.out.println(num1.toString().length());
		
		int num2 = 100000; // Aqui declarei uma variavel do tipo primitivo
		System.out.println(Integer.toString(num2)); // Neste caso na hora de imprimir eu utilizei a funçao to string diretamente do Integer
	}
}
