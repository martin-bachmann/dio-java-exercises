package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(7.7);
		notas.add(9.0);
		notas.add(8d);
		notas.add(9.3);
		System.out.println("Adiciona notas: " + notas.toString());
		
		System.out.println("Índice da nota 8.0: " + notas.indexOf(8.0));
		
		notas.add(3, 5.0);
		System.out.println("Adiciona nota 5 na posição 3: " + notas.toString());
		
		notas.set(notas.indexOf(8.0), 8.5);
		System.out.println("Altera a nota 8 para 8.5" + notas.toString());
		
		System.out.println("Verifica se a lista contém a nota 8: " + notas.contains(8d));
		
		System.out.println("Seleciona a nota na posição 4: " + notas.get(4));
		
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
		
		notas.remove(0);
		System.out.println("Remove a nota na posição 0: " + notas);
		
		notas.remove(9d);
		System.out.println("Remove a nota 9: " + notas);

		Iterator<Double> iterator2 = notas.iterator();
		while(iterator2.hasNext()) {
			Double next = iterator2.next();
			if(next < 7) iterator2.remove();
		}
		System.out.println("Remove todas as notas menores que 7: " + notas);
		
		notas.clear();
		System.out.println("Remove todas as notas: " + notas);
		
		System.out.println("Verifica se a lista está vazia: " + notas.isEmpty());
		
		List<Double> notas2 = new ArrayList(Arrays.asList(7, 8.5, 9, 10));
		
		
	}
}
