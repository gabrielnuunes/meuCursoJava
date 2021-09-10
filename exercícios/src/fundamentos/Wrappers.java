package fundamentos;

public class Wrappers {
	
public static void main(String[] args) {
	
	Byte b = 100;
	Short s = 1000;
	
	Integer i = 10000;
	Long l = 100000L; // o L indica que é do tipo long
	
	//Converteu o valor de um objeto para um primitivo 
	
	System.out.println(b.byteValue()); // Aqui ele pega o valor do byte
	System.out.println(s.toString()); // Aqui ele esta transformando o valor do s em string
	System.out.println(i * 3);
	System.out.println(l / 3);
	
	// Float
	Float f = 123.10F;
	System.out.println(f);
	
	Double d = 1234.5678;
	System.out.println(d);
	
	Boolean bo = Boolean.parseBoolean("true"); // Neste caso pegamos a string e transformamos em boolean
	System.out.println(bo);
	System.out.println(bo.toString().toUpperCase()); // Neste caso estamos transformando para string e colocando em caixa alta
	
	Character c = '#';
	System.out.println(c + "...");
}
}
