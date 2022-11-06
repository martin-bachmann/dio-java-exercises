package collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<Double> notas = new HashSet<Double>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		System.out.println("Adiciona notas: " + notas.toString());
		
		System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
		
		System.out.println("Pega a menor nota: " + Collections.min(notas));
		
		System.out.println("Pega a maior nota: " + Collections.max(notas));
		
		Double soma = 0d;
		Iterator<Double> iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma+= next;
		}
		System.out.println("Pega a soma: " + soma);
		
		System.out.println("Pega a média: " + soma / notas.size());
		
		notas.remove(0.0);
		System.out.println("Remove a nota 0: " + notas);
		
		Iterator<Double> iterator2 = notas.iterator();
		while(iterator2.hasNext()) {
			Double next = iterator2.next();
			if(next < 7) iterator2.remove();
		}
		System.out.println("Remove todas as notas menores que 7: " + notas);
		
		Set<Double> notas2 = new LinkedHashSet<Double>();
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(0d);
		notas2.add(3.6);
		System.out.println("Em ordem de inserção: " + notas2);
		
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println("Em ordem crescente: " + notas3);
		
		notas.clear();
		System.out.println("Remove todas as notas: " + notas);
		
		System.out.println("Verifica se a lista está vazia: " + notas.isEmpty());
	}
}
