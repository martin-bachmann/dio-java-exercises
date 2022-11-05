package dio.methods;

public class Methods {
	public static void main(String[] args) {
		Calculadora.calcular(10, 2);
		verificarIdade(5);
		verificarIdade(23);
	}
	
	public static void verificarIdade(int idade) {
		if (idade >= 18) {
			maiorIdade();
		} else {
			menorIdade();
		}
	}
	
	public static void maiorIdade() {
		System.out.println("É maior de idade");
	}
	
	public static void menorIdade() {
		System.out.println("É menor de idade");
	}
}
