public abstract class Veiculo {
  private String placa;
  private int anoFabricacao;
  protected double taxaPedagio = 6.0;

  public Veiculo(String placa, int anoFabricacao) {
    this.placa = placa;
    this.anoFabricacao = anoFabricacao;
  }

  public String getPlaca() {
    return this.placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAnoFabricacao() {
    return this.anoFabricacao;
  }

  public void setAnoFabricacao(int anoFabricacao) {
    this.anoFabricacao = anoFabricacao;
  }

  public double calcPedagio() {
    return this.taxaPedagio;
  }
  
}
