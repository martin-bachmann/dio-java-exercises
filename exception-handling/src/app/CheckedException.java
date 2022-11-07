package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CheckedException {
  public static void main(String[] args) {
    imprimirArquivo("arquivo.txt");

    System.out.println("Apesar de jogar exception ou não, o programa continua");
  }

  public static void imprimirArquivo(String nomeDoArquivo) {
    File file = new File(nomeDoArquivo);

    try (BufferedReader br = new BufferedReader(new FileReader(file.getName()))) {
      String line = br.readLine();

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      do {
        bw.write(line);
        bw.newLine();
        line = br.readLine();
      } while (line != null);
      bw.flush();
      bw.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
