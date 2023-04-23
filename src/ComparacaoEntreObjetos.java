
public class ComparacaoEntreObjetos {
	
	public static void main(String[] args) {
		
	
		String nome1 = "JAVA";
		String nome2 = "JAVA";
	
		
		System.out.println(nome1==nome2); //true
		
		String nome3 = new String("JAVA"); //criando um objeto
		
		System.out.println(nome1==nome3); //false
		
		String nome4 = nome3;
		
		System.out.println(nome3==nome4); //true
		
		System.out.println(nome1.equals(nome2)); //true
		System.out.println(nome2.equals(nome3)); //true
		System.out.println(nome3.equals(nome4)); //true
		
		/**
		 * == versus equals: Existe uma relevância forte,
		 *  em realizar comparações com == e equals na qual precisamos ter uma compreensão de quais
		 *   as regras seguidas pela linguagem **** , exemplo:
		 */
		
		int numero1 = 130;
		int numero2 = 130;
		System.out.println(numero1==numero2);
		
			Integer inteiroNumero1 = 130;
			Integer InteiroNumero2 = 130;
			System.out.println(inteiroNumero1==InteiroNumero2);
		
			// A razão pela qual o resultado é false, é devido o Java tratar os valores
	        // Como objetos a partir de agora.
	        // Qual a solução ?
	        // Quando queremos comparar objetos, usamos o método equals
		
			
					System.out.println(inteiroNumero1.equals(InteiroNumero2));
	}	

}
