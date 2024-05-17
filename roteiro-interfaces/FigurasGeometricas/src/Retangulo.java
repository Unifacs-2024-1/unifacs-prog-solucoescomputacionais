public class Retangulo implements FiguraGeometrica{
  private double altura;
  private double largura;

  public Retangulo(double altura, double largura) {
    this.altura = altura;
    this.largura = largura;
  }

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return this.largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

  @Override
  public String getNomeFigura() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getNomeFigura'");
  }

  @Override
  public double getArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getArea'");
  }

  @Override
  public double getPerimetro() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPerimetro'");
  }

}
