package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2)); // Neste caso ele ir� mostrar qual o caracter no index 2
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!")); // Neste caso aqui estou concatenando !!! a String original
		System.out.println(s + "!!!"); // Neste caso aqui com o sinal de + tamb�m ir� funcionar 
		System.out.println(s.startsWith("Boa")); // Aqui estou verificando se a string come�a com a palavra Boa
		System.out.println(s.toLowerCase()); // Aqui estou passando a string para minusculo
		System.out.println(s.toUpperCase()); // Neste caso estou passando a string para maiusculo
		System.out.println(s.toLowerCase().startsWith("boa")); // Neste caso eu estou encadeando duas fun�oes, era para retornar false mas por eu ter transformado antes deu true
		System.out.println(s.length()); // Verifica o tamanho da string
		System.out.println(s.equals("boa tarde")); // verifica se a string � igual � boa tarde ou seja false
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Neste caso ir� verificar se a string � igual, sem considerar maiusculas ou minusculas
		
		var nome = "Pedro"; // variavel criada por inferencia
		var sobrenome = "Santos";  // variavel criada por inferencia
		var idade = 33; // variavel criada do tipo int 
		var salario = 12345.987; //Variavel por inferencia padr�o ser� double
		// var salario1 = 12345.987F; // Neste caso tamb�m ser� uma vari�vel mas do tipo float pois tem um F na frente dela indicando
		
		// Forma normal de se imprimir variaveis concatenando
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		//Outra forma de se imprimmir variaeis concatenando
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		// Neste caso acima o porcento permite a utiliza�ao de variaveis dentro do que ir� ser impresso 
		
		
		//Nesta string abaixo far� a mema fun�ao so syso feito acima
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Qualquer coisa".contains("coi")); //verifica se contem determinado trecho
		System.out.println("Qualquer coisa".indexOf("oi")); // Mostra a partir de qual index contem determinado trecho
	}
}
