public class Cliente {
  private String cpf_cnpj;
  private String nome;
  private String endereco;
  private String telefone;
  private String email;

  public Cliente(String cpf_cnpj, String nome, String endereco, String telefone, String email) {
    this.cpf_cnpj = cpf_cnpj;
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
  }

	public String getCpf_cnpj() {
		return this.cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}