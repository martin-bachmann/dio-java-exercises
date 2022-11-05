import java.util.Scanner;

public class TryCatch {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Informe sua altura: ");
      double altura = scanner.nextDouble();
      System.out.println("Sua altura é " + altura);
    } catch (Exception e) {
      System.out.println("Valor invalido");
    } finally {
      System.out.println("Valeu!");
    }
  }
}
