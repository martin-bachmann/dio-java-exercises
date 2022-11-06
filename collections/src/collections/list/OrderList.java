package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderList {
	public static void main(String[] args) {
		List<Gato> meusGatos = new ArrayList<Gato>() {{
			add(new Gato("Jon", 9, "preto"));
			add(new Gato("Simba", 3, "tigrado"));
			add(new Gato("Jon", 7, "amarelo"));
		}};
		System.out.println(meusGatos);
		
		System.out.println("Ordem aleatoria");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordenar a lista com interface Comparable");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordenar a lista com interface Comparator");
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Outro exemplo");
		Collections.sort(meusGatos, new ComparatorCor());
		System.out.println(meusGatos);
	}
}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato arg0) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(arg0.getNome());
	}
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato arg0, Gato arg1) {
		// TODO Auto-generated method stub
		return Integer.compare(arg0.getIdade(), arg1.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato arg0, Gato arg1) {
		// TODO Auto-generated method stub
		return arg0.getCor().compareToIgnoreCase(arg1.getCor());
	}
}
