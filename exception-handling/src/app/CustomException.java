package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CustomException {
  public static void main(String[] args) {
    imprimirArquivo("arquivo.txt");

    System.out.println("Apesar de jogar exception ou não, o programa continua");
  }

  public static void imprimirArquivo(String nomeDoArquivo) {
    try {
      BufferedReader br = lerArquivo(nomeDoArquivo);
      String line = br.readLine();

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      do {
        bw.write(line);
        bw.newLine();
        line = br.readLine();
      } while (line != null);
      bw.flush();
      bw.close();
    } catch (ImpossivelAberturaDeArquivoException e) {
      System.out.println("Custom error " + e);
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {
    File file = new File(nomeDoArquivo);
    try {
      return new BufferedReader(new FileReader(file.getName()));
    } catch (FileNotFoundException e) {
      throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getAbsolutePath());
    }
  }
}

class ImpossivelAberturaDeArquivoException extends Exception {
  private final String nomeDoArquivo;
  private final String diretorio;

  public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) {
    super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
    this.nomeDoArquivo = nomeDoArquivo;
    this.diretorio = diretorio;
  }

  @Override
  public String toString() {
    return "ImpossívelAberturaDeArquivoException{" +
        "nomeDoArquivo='" + nomeDoArquivo + "\'" +
        ", diretorio='" + diretorio + "\'" +
        "}";
  }
}
