public class Ligacao {
  private String numOrigem;
  private String numDestino;
  private String localOrigem;
  private String localDestino;
  private Tempo horaInicio;
  private Tempo horaFim;

  public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino) {
    this.numOrigem = numOrigem;
    this.numDestino = numDestino;
    this.localOrigem = localOrigem;
    this.localDestino = localDestino;
  }

	public String getNumOrigem() {
		return this.numOrigem;
	}

	public void setNumOrigem(String numOrigem) {
		this.numOrigem = numOrigem;
	}

	public String getNumDestino() {
		return this.numDestino;
	}

	public void setNumDestino(String numDestino) {
		this.numDestino = numDestino;
	}

	public String getLocalOrigem() {
		return this.localOrigem;
	}

	public void setLocalOrigem(String localOrigem) {
		this.localOrigem = localOrigem;
	}

	public String getLocalDestino() {
		return this.localDestino;
	}

	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}

	public String getHoraInicio() {
		return this.horaInicio.toString();
	}

	public void setHoraInicio(int hora, int minuto, int segundo) {
		this.horaInicio = new Tempo(hora, minuto, segundo);
	}

	public String getHoraFim() {
		return this.horaFim.toString();
	}

	public void setHoraFim(int hora, int minuto, int segundo) {
		this.horaFim = new Tempo(hora, minuto, segundo);
	}


}