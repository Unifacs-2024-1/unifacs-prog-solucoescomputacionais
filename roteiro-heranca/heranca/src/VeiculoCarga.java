public class VeiculoCarga extends Veiculo {

  private int pesoMax;

  public VeiculoCarga(String placa, int anoFabricacao, int pesoMax) {
    super(placa, anoFabricacao);
    this.pesoMax = pesoMax;
  }

  public int getPesoMax() {
    return this.pesoMax;
  }

  public void setPesoMax(int pesoMax) {
    this.pesoMax = pesoMax;
  }

  @Override
  public double calcPedagio() {
    super.taxaPedagio = 2.0;
    return super.taxaPedagio * this.pesoMax;
  }
}
