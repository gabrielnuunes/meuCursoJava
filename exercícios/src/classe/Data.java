package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // Dessa forma está se utilizando do this como um método/ função para construir uma instancia
	}
	
	// O uso do this para referenciar um objeto atual
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//Esta é a melhor forma 
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // Neste caso eu declarei em uma variavel o formato que eu quero que seja impresso 
		return String.format(formato, dia, mes, ano); // Neste caso para imprimir uma string formatada utiliza-se string.format
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada()); // Neste caso foi criado um metodo que retorna nada(void), que imprime um syso com um metodo dentro
	}
}
