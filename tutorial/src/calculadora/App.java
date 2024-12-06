package calculadora;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		String mensagem = "Multiplicação: ";
		
		System.out.println(mensagem + calculadora.multiplicar(7, 8));
		System.out.println(mensagem + calculadora.multiplicar(2, 3));
		System.out.println(mensagem + calculadora.multiplicar(1, 8));
		System.out.println(mensagem + calculadora.multiplicar(8, 9));
		System.out.println(mensagem + calculadora.multiplicar(2, 1));		
		System.out.println("A soma é: " + calculadora.somar(6, 6));

	}

}
