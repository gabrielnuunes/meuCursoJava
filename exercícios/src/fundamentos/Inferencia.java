package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5; //Declaração da variável
		System.out.println(a);
		
		a = 12; // Posso dessa forma atribuir um novo valor a uma variavel 
		System.out.println(a);
		//Uma vez declarada a variável não muda de forma, ex: string sempre string, double sempre double;
		
		//Uma vez a variavel declarada com valor inteiro ela não pode ser declarada com valores decimais;
		
		//Neste caso estamos utilizando a inferencia meio que uma dedução do tipo de variável declarada;
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto"; //Neste caso eu não poderia declarar outro dado dentro da variável c, a não ser uma string;
		System.out.println(c);
		
		double d; // Variável declarada 
		d = 123.65; // Variável inicializada
		System.out.println(d); // Variável utilizada
		
		/* 
		 No exemplo acima não pode ser feito com var, pois no var a variável precisa ser
		 declarada e inicializada para que possa assim ter a inferencia do dado declarado
		 Ex; var e;
		 	e = 12345;
		 	dessa forma não pode pois o var teria que ter o valor para ser inferido pelo java.
		  */
		 
	}
}
