package classe;

public class PrimeiroTrauma {
	int a = 3;
	
	static int b = 4; // Dessa forma não precisa criar uma nova instancia 
	
	public static void main(String[] args) {
		
		//membro estatico consegue acessar outro membro estatico
		//um membro de classe tambem consegue acessar outro membro de classe
		
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b); // Dessa forma eu consigo imprimir sem criar uma nova instancia somente por ter criado um static la em cima
	}
	
}
