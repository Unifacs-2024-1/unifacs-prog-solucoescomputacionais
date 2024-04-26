public class Loja {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private String valorFat;
    private String area;
    private String nomeProprietario;

	// Parte 2 - Sobrecarga de Construtores
	Loja (String nomeFantasia, String razaoSocial, String cnpj) {
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	// Parte 2 - Sobrecarga de Construtores
	Loja (String nomeFantasia, String cnpj) {
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.razaoSocial = nomeFantasia;
	}

	// Parte 1 - Questão 2
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return this.razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getValorFat() {
		return this.valorFat;
	}

	public void setValorFat(String valorFat) {
		this.valorFat = valorFat;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNomeProprietario() {
		return this.nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

    

    public Loja(String nomeFantasia, String cnpj, String endereco, String telefone, String email, String site) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.site = site;
    }

}