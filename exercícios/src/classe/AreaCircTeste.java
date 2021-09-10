package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10); // Neste caso criei uma nova areacirc passando como parametro do raio o 10
		
		AreaCirc a2 = new AreaCirc(3);// Neste caso estamos acessando a areacirc que pertence a uma instancia no caso areacircteste
		
		System.out.println(a1.area()); 
		// Neste caso na hora em que vou imprimir o valor eu chamo o metodo dentro do syso e referenciando a variavel que eu quero o resultado
		System.out.println(a2.area());
		
		// Outra forma de calcular o raio, é acessando a area que pertence a classe areacirc 
		System.out.println(AreaCirc.area(100)); // Neste caso dentro do syso eu coloco qual parametro da classe eu quero acessar 
		System.out.println(AreaCirc.PI); // Neste estou acessando o Pi criado por mim 
		System.out.println(Math.PI); // Neste caso estou acessando o Pi do proprio java pela classe math
		
		System.out.println(a1.PI);
	}
}
