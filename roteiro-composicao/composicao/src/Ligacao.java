public class Ligacao {
  private String numOrigem;
  private String numDestino;
  private String localOrigem;
  private String localDestino;
  private String horaInicio;
  private String horaFim;

  public Ligacao(String numOrigem, String numDestino, String localOrigem, String localDestino, String horaInicio, String horaFim) {
    this.numOrigem = numOrigem;
    this.numDestino = numDestino;
    this.localOrigem = localOrigem;
    this.localDestino = localDestino;
    this.horaInicio = horaInicio;
    this.horaFim = horaFim;
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
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return this.horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}


}