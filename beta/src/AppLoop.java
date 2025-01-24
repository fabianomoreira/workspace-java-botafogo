
public class AppLoop {

	public static void main(String[] args) {
		// loop for
		for(int i = 1; i <= 20; i++) {
			System.out.println(i + " Meus alunos são desanimados!");
		}
		
		// while
		boolean acao = false;
		
		while(acao) {
			System.out.println("Outro loop");
			acao = false;
		}
		
		// do..while
		do {
			System.out.println("Este é o loop do...");
		} while(acao == true);
		
		/*
		 * números pares até 100
		 */
		int limite = 100;
		for(int i = 0; i <= limite; i+=2) {
			
			String valor = i < limite ? i + ", " : i + ""; 
			
			System.out.print(valor);
		}
	}

}
