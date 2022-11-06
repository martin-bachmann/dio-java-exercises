package collections.javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsAPI {
	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos");
		numeros.stream().forEach(System.out::println);
		
		System.out.println("Adicione os 5 primeiros números em um set");
		numeros.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("Transforme a lista de strings em uma lista de integers");
		List<Integer> numerosInteiros = numeros.stream().map(Integer::parseInt).collect(Collectors.toList());
		numerosInteiros.stream().forEach(System.out::println);
		
		System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
		List<Integer> paresMaiores = numerosInteiros.stream().filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
		paresMaiores.stream().forEach(System.out::println);
		
		System.out.println("Pegue a média dos números");
		numeros.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
		
		System.out.println("Remova os valores ímpares");
		numerosInteiros.removeIf(integer -> integer % 2 != 0);
		paresMaiores.stream().forEach(System.out::println);
	}
}
