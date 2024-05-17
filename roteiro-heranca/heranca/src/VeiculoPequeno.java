public class VeiculoPequeno extends Veiculo {
  private String modelo;

  public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
    super(placa, anoFabricacao);
    this.modelo = modelo;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  
}
