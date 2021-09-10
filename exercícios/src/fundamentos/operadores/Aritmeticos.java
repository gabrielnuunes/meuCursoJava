package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(3 + 5);
		
		var x = 34.56; // Neste caso estamos declarando um float por inferencia	
		double y = 2.2; // Neste caso estamos declarando um float de forma explicita
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // Neste caso estamos fazendo uma divisao mas convertendo o valor de b para double (que é mais preciso)
		System.out.println(a / (float) b); // Neste caso estamos fazendo uma divisao mas convertendo o valor de b para float (que é preciso)
		
		System.out.println(a % b); // Neste caso estamos tirando o modulo de a e b, ou seja o resto da divisao
		System.out.println(8 % 3); // Aqui tambem esta sendo mostrado somente o resto da divisao
	} 
}
