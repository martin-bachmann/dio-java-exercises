package app;

import javax.swing.JOptionPane;

public class UncheckedException {
  public static void main(String[] args) {
    boolean continueLooping = true;

    do {
      String a = JOptionPane.showInputDialog("Numerador: ");
      String b = JOptionPane.showInputDialog("Numerador: ");

      try {
        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);

        continueLooping = false;
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada invalida, informe um número inteiro! " + e);
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0! " + e);
      } finally {
        System.out.println("Chegou no finally");
      }
    } while (continueLooping);

    System.out.println("Saiu!");
  }

  static int dividir(int a, int b) {
    return a / b;
  }
}
