package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // Neste caso foi feito a atribui��o por valor ou seja uma c�pia (Primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Neste caso a atribui��o foi feita por refer�ncia ou seja apontam pro mesmo valor (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.obterDataFormatada()); // Neste caso ap�s feita a altera��o dos valores, a mudan�a foi feiita em ambos
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1); // Neste caso quando feita a altera��o no d1, por ser um objeto, ir� alterar o d2 tamb�m.
		
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
	
	static void alterarPrimitivo(int a) { // Neste caso ele n�o ir� gerar impacto na variavel primitiva pois � gerado uma c�pia e n�o altera a variavel "raiz"
		a++;
	}
}
