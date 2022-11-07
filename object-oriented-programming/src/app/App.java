package app;

public class App {
  public static void main(String[] args) throws Exception {
    Veiculo carro = new Carro("Preto", "Uno", 25);

    System.out.println("Encher tanque: " + carro.encherTanque(3.99));

    Jogo xadrez = new Xadrez();
    xadrez.jogar();
  }
}
