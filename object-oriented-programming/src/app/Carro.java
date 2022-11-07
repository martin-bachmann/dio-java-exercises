package app;

public class Carro extends Veiculo {
  Carro(String cor, String modelo, int capacidadeTanque) {
    super(cor, modelo, capacidadeTanque);
  }

  @Override
  public void mover() {
    System.out.println("O carro se move");
  }
}
