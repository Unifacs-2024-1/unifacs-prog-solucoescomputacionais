public class VeiculoPasseio extends Veiculo {
  private int qtdMaxPassageiros;

  public VeiculoPasseio(String placa, int anoFabricacao, int qtdMaxPassageiros) {
    super(placa, anoFabricacao);
    this.qtdMaxPassageiros = qtdMaxPassageiros;
  }

  public int getQtdMaxPassageiros() {
    return this.qtdMaxPassageiros;
  }

  public void setQtdMaxPassageiros(int qtdMaxPassageiros) {
    this.qtdMaxPassageiros = qtdMaxPassageiros;
  }

}