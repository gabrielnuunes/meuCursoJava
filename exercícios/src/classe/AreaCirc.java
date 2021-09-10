package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415; 
	// Neste caso estou colocando static para demarcar que o valor � desta classe, e colocando final para ser uma constante
	// e n�o ser alterada
	
	AreaCirc(double raioInicial){
		raio = raioInicial;		
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	// Criando um metodo estatico que pertence a classe
	static double area(double raio) { // Neste caso para n�o ficar igual ao metodo anterior modifiquei o nome da variavel que � passada como parametro
		return PI * Math.pow(raio, 2);
	}
}
