package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23; // o Byte vai de -128 a 127
		short numeroDeVoos = 542; // 
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // O L no final indica que é uma variavel do tipo Long
		
		//Tipos numéricos reais
		float salario = 11_445.44F; // O F indica que esta recebendo um literal do tipo float
		double vendasAcumuladas = 2_991_797_103.01; // Para facilitar a leitura pode se colocar underline
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo, neste caso o char so permite uma letra
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens 
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
