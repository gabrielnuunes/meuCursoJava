package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // Neste caso foi feito a atribuição por valor ou seja uma cópia (Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Neste caso a atribuição foi feita por referência ou seja apontam pro mesmo valor (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada()); // Neste caso após feita a alteração dos valores, a mudança foi feiita em ambos
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1); // Neste caso quando feita a alteração no d1, por ser um objeto, irá alterar o d2 também.
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) { // Neste caso criei um metodo que altera o valor da data para a determinada (1/1/1970)
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) { // Neste caso ele não irá gerar impacto na variavel primitiva pois é gerado uma cópia e não altera a variavel "raiz"
		a++;
	}
}
