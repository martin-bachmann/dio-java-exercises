public class App {
  public static void main(String[] args) {
    int valorMaior = 10;
    int valorMenor = 5;

    qualMaior(valorMaior, valorMenor);

    qualMaior(valorMenor, valorMaior);

    qualMaior(valorMaior, valorMaior);

    verdadeiroOuFalso(true);

    verdadeiroOuFalso(false);

    tamanho("M");

    tamanho("G");
  }

  public static void qualMaior(int a, int b) {
    if (a > b) {
      System.out.println("O valor é maior");
    } else if (a < b) {
      System.out.println("O valor é menor");
    } else {
      System.out.println("Valores são iguais");
    }
  }

  public static void verdadeiroOuFalso(boolean valor) {
    System.out.println(valor ? "Verdadeiro" : "Falso");
  }

  public static void tamanho(String sigla) {
    switch (sigla) {
      case "P": {
        System.out.println("Pequeno");
        break;
      }
      case "M": {
        System.out.println("Medio");
        break;
      }
      case "G": {
        System.out.println("Grande");
        break;
      }
      default: {
        System.out.println("Não definido");
        break;
      }
    }
  }
}
