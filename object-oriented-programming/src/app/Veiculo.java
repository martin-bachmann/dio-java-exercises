package app;

public class Veiculo {
  private String cor;
  private String modelo;
  private int capacidadeTanque;

  Veiculo(String cor, String modelo, int capacidadeTanque) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeTanque = capacidadeTanque;
  }

  public String getCor() {
    return cor;
  }

  public String getModelo() {
    return modelo;
  }

  public int getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public double encherTanque(double precoGasolina) {
    return capacidadeTanque * precoGasolina;
  }

  public void mover() {
    System.out.println("O veículo se move");
  }
}
