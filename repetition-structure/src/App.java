public class App {
  public static void main(String[] args) {
    // for simples
    for (int index = 0; index < 5; index++) {
      System.out.println("for: " + index);
    }

    // for com array
    String[] nomes = { "João", "Maria", "Ana" };
    for (int index = 0; index < nomes.length; index++) {
      System.out.println("for com array: " + nomes[index]);
    }

    // for each
    for (String nome : nomes) {
      System.out.println(("for each: " + nome));
    }

    // break e continue
    for (int index = 0; index < 5; index++) {
      if (index == 1)
        continue;
      if (index == 3)
        break;
      System.out.println("continue e break: " + index);
    }

    // while
    int index2 = 0;
    while (index2 < 5) {
      System.out.println("while: " + index2);
      index2++;
    }

    // do while
    int index3 = 0;
    do {
      System.out.println("Do while: " + index3);
      index3++;
    } while (index3 < 5);
  }
}
