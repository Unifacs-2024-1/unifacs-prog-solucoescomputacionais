public class Ligacao {
  private String numOrigem;
  private String numDestino;
  private String localOrigem;
  private String localDestino;
  private Tempo horaInicio;
  private Tempo horaFim;

  public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio) {
    this.numOrigem = numOrigem;
    this.numDestino = numDestino;
    this.localOrigem = localOrigem;
    this.localDestino = localDestino;
    this.horaInicio = horaInicio;
    this.horaFim = "";
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

	public Tempo getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String hora, String minuto, String segundo) {
		this.horaInicio = new Tempo(hora, minuto, segundo);
	}

	public Tempo getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(String hora, String minuto, String segundo) {
		this.horaFim = new Tempo(hora, minuto, segundo);
	}


}