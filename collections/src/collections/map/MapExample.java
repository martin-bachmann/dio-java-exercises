package collections.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Double> carros = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		
		System.out.println(carros);
		
		System.out.println("Substitua o consumo do gol por 15.2");
		carros.put("gol", 15.2);
		System.out.println(carros);
		
		System.out.println("Confere se existe modelo tucson: " + carros.containsKey("tucson"));
		
		System.out.println("Exibe o consumo do uno: " + carros.get("uno"));
		
		System.out.println("Exiba os modelos: ");
		Set<String> modelos = carros.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos: ");
		Collection<Double> consumos = carros.values();
		System.out.println(consumos);
		
		System.out.println("Exiba o mais econômico: ");
		Double maisEconomico = Collections.max(consumos);
		Set<Map.Entry<String, Double>> entries = carros.entrySet();
		String modeloMaisEficiente = "";
		for (Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(maisEconomico)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println(modeloMaisEficiente);
			}
		}
		
		System.out.println("Exiba o menos econômico: ");
		Double menosEconomico = Collections.min(consumos);
		String modeloMenosEficiente = "";
		for (Map.Entry<String, Double> entry: carros.entrySet()) {
			if(entry.getValue().equals(menosEconomico)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println(modeloMenosEficiente + " consumo: " + entry.getValue());
			}
		}
		
		System.out.println("Exibe a soma dos consumos");
		Iterator<Double> iterator = carros.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		System.out.println("Média dos consumos: " + soma / carros.size());
		
		System.out.println("Remova os consumos igual a 15.6");
		Iterator<Double> iterator2 = carros.values().iterator();
		while(iterator2.hasNext()) {
			if (iterator2.next().equals(15.6)) iterator2.remove();
		}
		System.out.println(carros);
		
		Map<String, Double> carros2 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println("Exiba ordenado pela inserção: ");
		System.out.println(carros2);
		
		Map<String, Double> carros3 = new TreeMap<>(carros2);
		System.out.println("Exiba ordenado pela inserção: ");
		System.out.println(carros3);
		
		System.out.println("Apague o map: ");
		carros.clear();
		System.out.println(carros);
		
		System.out.println("Verifique se está vazio: ");
		System.out.println(carros.isEmpty());
	}
}
