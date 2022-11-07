package app;

public class Moto extends Veiculo {
  Moto(String cor, String modelo, int capacidadeTanque) {
    super(cor, modelo, capacidadeTanque);
  }

  @Override
  public void mover() {
    System.out.println("A moto se move");
  }
}
