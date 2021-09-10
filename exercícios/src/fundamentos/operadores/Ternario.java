package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "em recupera��o." : "Reprovado.";
		String resultadoFinal = media >= 7.0 ? "Aprovado." : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.println("Tem desconto? " + temDesconto); // Neste caso ir� printar true ou false
		System.out.println("Tem desconto? " + resultado);
		System.out.printf("Tem desconto? %s", resultado); // Outra forma de printar o resultado � com printf
	}
}
