package dio.methods;

public class Calculadora {
	public static void calcular(int a, int b) {
		System.out.println("Soma: " + soma(a, b));
		System.out.println("Subtração: " + subtracao(a, b));
		System.out.println("Divisão: " + divisao(a, b));
		System.out.println("Multiplicação: " + multiplicacao(a, b));
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
	}
	
	public static int divisao(int a, int b) {
		return a / b;
	}
	
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
}
