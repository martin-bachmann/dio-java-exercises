package collections.javaStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class JavaStreams {
	public static void main(String[] args) {
		List<Gato> meusGatos = new ArrayList<Gato>() {{
			add(new Gato("Jon", 9, "preto"));
			add(new Gato("Simba", 3, "tigrado"));
			add(new Gato("Jon", 7, "amarelo"));
		}};
		System.out.println(meusGatos);
		
		System.out.println("Ordenar a lista com classe anônima");
		meusGatos.sort(new Comparator<Gato>() {

			@Override
			public int compare(Gato arg0, Gato arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getIdade(), arg1.getIdade());
			}
		});
		System.out.println(meusGatos);
		
		System.out.println("Ordenar a lista com Lambda");
		meusGatos.sort(Comparator.comparing(new Function<Gato, String>() {
			@Override
			public String apply(Gato gato) {
				return gato.getNome();
			}
		}));
		System.out.println(meusGatos);
		
		meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
		System.out.println(meusGatos);
		
		System.out.println("Ordenar a lista com Lambda e reference method");
		meusGatos.sort(Comparator.comparing(Gato::getNome));
		System.out.println(meusGatos);
		
		// Exercícios
		System.out.println("Ordem aleatória");
		Map<String, Livro> meusLivros = new HashMap<String, Livro>() {{
			put("João", new Livro("Livro 1", 235));
			put("Ana", new Livro("Animais da floresta", 139));
			put("Rodrigo", new Livro("História do mundo", 457));
		}};
		for(Map.Entry<String, Livro> livro: meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Ordem alfabética por nomes do livro com classe anonima");
		Set<Map.Entry<String, Livro>> meusLivros2 = new TreeSet<Map.Entry<String, Livro>>(new Comparator<Map.Entry<String, Livro>>() {
			@Override
			public int compare(Map.Entry<String, Livro> arg0, Map.Entry<String, Livro> arg1) {
				// TODO Auto-generated method stub
				return arg0.getValue().getNome().compareToIgnoreCase(arg1.getValue().getNome());
			}
		});
		meusLivros2.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro: meusLivros2)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Ordem por páginas com comparing");
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<Map.Entry<String, Livro>> (Comparator.comparing(
			new Function<Map.Entry<String, Livro>, Integer>() {
				@Override
				public Integer apply(Entry<String, Livro> liv) {
					// TODO Auto-generated method stub
					return liv.getValue().getPaginas();
				}
			}));
		meusLivros3.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro: meusLivros3)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
		
		System.out.println("Ordem alfabética por autor com lambda");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<Map.Entry<String, Livro>> (Comparator.comparing(
			liv -> liv.getKey()));
		meusLivros4.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro: meusLivros4)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
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

class Livro {
	private String nome;
	private Integer paginas;
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}
	
}

