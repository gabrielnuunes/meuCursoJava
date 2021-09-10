package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto(); // Neste caso estou criando meu novo objeto produto por inferencia de var 
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		// Forma de se criar um objeto passando todos os dados como parametro
		Produto p3 = new Produto("Celular", 4000);
		
		System.out.printf("O nome do produto é: %s , seu preço é de: R$%.2f , e o valor com desconto é de: . \n", p3.nome, p3.preco);
		
		System.out.println(p1.nome); // Neste caso estou acessando o nome do meu objeto p1
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("O preco final do produto p1 é: R$%.2f.\n", precoFinal1);
		System.out.printf("O preco final do produto p2 é: R$%.2f.\n", precoFinal2);
		System.out.printf("A média de preço final do carrinho é: R$%.2f.\n", mediaCarrinho);
		
		Produto p4 = new Produto("Teclado", 129.90);
		double precoFinal4 = p4.precoComDesconto();
		System.out.printf("O %s com o desconto fica: R$%.2f.", p4.nome, precoFinal4);
		
		// Caso eu quisesse alterar o valor do desconto para todo o sistema, seria => Produto.desconto = 0.29;
	}
}
