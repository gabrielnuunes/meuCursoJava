package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		 
		double raio = 3.4;
		// Aqui eu declarei uma constante (final) e de ponto flutuante(double)
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		//Neste caso quando eu for reutilizar as variaveis ou constantes eu devo somente chamá-las uma vez que já foram
		//declaradas.
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("A área do raio é: " + area + " m².");
	}
}
