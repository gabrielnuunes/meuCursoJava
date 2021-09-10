package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 22;
		d1.mes = 4;
		d1.ano = 1993;
		
		Data d2 = new Data();
		d2.dia = 11;
		d2.mes = 5;
		d2.ano = 2013;
		
		Data d3 = new Data();
		d3.dia = 29;
		d3.mes = 9;
		d3.ano = 1996;
		
		String dataFormatada3 = d3.obterDataFormatada();
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano); // Esta é a forma padrão de imprimir uma data formatada
		System.out.println(d2.obterDataFormatada()); // Esta é uma das formas de imprimir uma data utilizando um metodo
		System.out.println(dataFormatada3); // Esta seria uma outra forma de imprimir uma data utilizando uma variavel para receber o valor do metodo 
		
		d1.imprimirDataFormatada(); // Neste caso estou chamando um metodo que possui um syso dentro não havendo a necessidade de imprimir via syso
		
		Data d4 = new Data(29, 9, 1996);
		System.out.printf("%d/%d/%d\n", d4.dia, d4.mes, d4.ano);
		
		Data d5 = new Data();
		System.out.printf("%d/%d/%d", d5.dia, d5.mes, d5.ano); 
	}
}
