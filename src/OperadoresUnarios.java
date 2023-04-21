
public class OperadoresUnarios {
	
	//exemplos de operadores unarios abaixo
	
	public static void main(String[] args) {
		
		int numero = 10;
		
		//imprimindo a numero negativo
		System.out.println(-numero);
		
		//imcrementando um numero mais 1, imprime 11
		numero++;
		System.out.println(numero);
		
		//imcrementando um numero mais 1, imprime 11
		System.out.println(numero++);
			
		//agora o numero voltou ao valor inicial
		System.out.println(numero);
		
		//ordem de precedencia conta aqui
		System.out.println(++ numero);

		boolean verdadeiro = true;

		System.out.println("Inverteu " + !verdadeiro);
	}

}
