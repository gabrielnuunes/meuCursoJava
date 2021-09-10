package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		double a = 4.5; //Declara��o da vari�vel
		System.out.println(a);
		
		a = 12; // Posso dessa forma atribuir um novo valor a uma variavel 
		System.out.println(a);
		//Uma vez declarada a vari�vel n�o muda de forma, ex: string sempre string, double sempre double;
		
		//Uma vez a variavel declarada com valor inteiro ela n�o pode ser declarada com valores decimais;
		
		//Neste caso estamos utilizando a inferencia meio que uma dedu��o do tipo de vari�vel declarada;
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto"; //Neste caso eu n�o poderia declarar outro dado dentro da vari�vel c, a n�o ser uma string;
		System.out.println(c);
		
		double d; // Vari�vel declarada 
		d = 123.65; // Vari�vel inicializada
		System.out.println(d); // Vari�vel utilizada
		
		/* 
		 No exemplo acima n�o pode ser feito com var, pois no var a vari�vel precisa ser
		 declarada e inicializada para que possa assim ter a inferencia do dado declarado
		 Ex; var e;
		 	e = 12345;
		 	dessa forma n�o pode pois o var teria que ter o valor para ser inferido pelo java.
		  */
		 
	}
}
