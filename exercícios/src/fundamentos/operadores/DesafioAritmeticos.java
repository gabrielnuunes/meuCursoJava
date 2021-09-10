package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		//Dica 
		/*
		 * int a = 3 * 4 - 10; // Que vai dar 2
		 * int b = (int) Math.pow(a, 3); // Neste caso estamos pegando o resultado de a que é 2, covertendo para inteiro e fazendo a terceira potencia
		 * double c = Math.pow(a, 3); // Neste caso faria a mesma operacao que a de cima mas armazenando em um double
		 * System.out.println(b);
 		 */
		
		// Minha resolução 
		double primeira = Math.pow((3 + 2) * 6, 2) / (3 * 2);
		double segunda = Math.pow(((1-5)*(2-7) / 2), 2);
		double terceira = Math.pow((primeira - segunda), 3);
		double quarta = terceira / Math.pow(10, 3);
		
		
		System.out.println(primeira);
		System.out.println(segunda);
		System.out.println(terceira);
		System.out.println(quarta);
		
		// Resolução do Professor
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println(resultado);
	}
}
