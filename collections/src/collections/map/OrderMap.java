package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrderMap {
	public static void main(String[] args) {
		System.out.println("Ordem aleatória");
		Map<String, Livro> meusLivros = new HashMap<String, Livro>() {{
			put("João", new Livro("Livro 1", 235));
			put("Ana", new Livro("Animais da floresta", 139));
			put("Rodrigo", new Livro("História do mundo", 457));
		}};
		for(Map.Entry<String, Livro> livro: meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Ordem de inserção");
		Map<String, Livro> meusLivros2 = new LinkedHashMap<String, Livro>() {{
			put("João", new Livro("Livro 1", 235));
			put("Ana", new Livro("Animais da floresta", 139));
			put("Rodrigo", new Livro("História do mundo", 457));
		}};
		for(Map.Entry<String, Livro> livro: meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Ordem alfabética");
		Map<String, Livro> meusLivros3 = new TreeMap<String, Livro>() {{
			put("João", new Livro("Livro 1", 235));
			put("Ana", new Livro("Animais da floresta", 139));
			put("Rodrigo", new Livro("História do mundo", 457));
		}};
		for(Map.Entry<String, Livro> livro: meusLivros3.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("Ordem alfabética por nomes do livro");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
		meusLivros4.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro: meusLivros4)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
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

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Map.Entry<String, Livro> arg0, Map.Entry<String, Livro> arg1) {
		// TODO Auto-generated method stub
		return arg0.getValue().getNome().compareToIgnoreCase(arg1.getValue().getNome());
	}
	
}
