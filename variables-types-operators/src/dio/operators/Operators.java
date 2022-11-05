package dio.operators;

public class Operators {
	public static void main(String[] args) {
		// pós-fixado
		int valor = 0;
		System.out.println(valor);
		
		valor++;
		System.out.println(valor);
		
		valor--;
		System.out.println(valor);
		
		// pré-fixado
		System.out.println(valor++);
		System.out.println(++valor);
		
		int valor2 = 3;
		
		// soma
		int soma = valor + valor2;
		System.out.println(soma);
		
		// subtracao
		int subtracao = valor - valor2;
		System.out.println(subtracao);
		
		// multiplicacao
		int multiplicacao = valor * valor2;
		System.out.println(multiplicacao);
		
		// divisao
		int divisao = valor / valor2;
		System.out.println(divisao);
		
		// mod
		int mod = valor % valor2;
		System.out.println(mod);
		
		// atribuicao
		valor += 5;
		valor -= 3;
		valor *= 2;
		valor /= 3;
		valor %= 2;
		
		System.out.println(valor);
	}
}
