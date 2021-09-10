package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	/*
	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	*/
	
	Produto() {
		
	}
}
