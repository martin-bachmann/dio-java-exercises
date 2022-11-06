package collections.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class OrderSet {
	public static void main(String[] args) {
		Set<Gato> meusGatos = new HashSet<Gato>() {{
			add(new Gato("Jon", 9, "preto"));
			add(new Gato("Simba", 3, "tigrado"));
			add(new Gato("Jon", 7, "amarelo"));
		}};
		System.out.println("Ordem aleatoria");
		for (Gato gato: meusGatos) System.out.println(gato);
		
		Set<Gato> meusGatos2 = new LinkedHashSet<Gato>() {{
			add(new Gato("Jon", 9, "preto"));
			add(new Gato("Simba", 3, "tigrado"));
			add(new Gato("Jon", 7, "amarelo"));
		}};
		System.out.println("Ordem de inserção");
		for (Gato gato: meusGatos2) System.out.println(gato);
		
		Set<Gato> meusGatos3 = new TreeSet<Gato>() {{
			add(new Gato("Jon", 9, "preto"));
			add(new Gato("Simba", 3, "tigrado"));
			add(new Gato("Jon", 7, "amarelo"));
		}};
		System.out.println("Ordem natural");
		for (Gato gato: meusGatos3) System.out.println(gato);
		
		Set<Gato> meusGatos4 = new TreeSet<Gato>(new ComparatorIdade());
		meusGatos4.addAll(meusGatos);
		System.out.println("Ordem com comparator");
		for (Gato gato: meusGatos4) System.out.println(gato);
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
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Gato arg0) {
		// TODO Auto-generated method stub
		int nome = this.getNome().compareToIgnoreCase(arg0.getNome());
		if (nome != 0) return nome;
		return Integer.compare(this.getIdade(), arg0.getIdade());
	}
}

class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato arg0, Gato arg1) {
		// TODO Auto-generated method stub
		return Integer.compare(arg0.getIdade(), arg1.getIdade());
	}
}
