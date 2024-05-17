public class Cliente {

  private String nome;
  private String endereco;
  private String telefone;
  private String municipio;

  public Cliente(String nome, String endereco, String telefone, String municipio) {
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.municipio = municipio;
  }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


  
  
}
