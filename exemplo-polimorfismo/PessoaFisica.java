
public class PessoaFisica extends Cliente {
    private String nomeSocial;

    public PessoaFisica(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNome() {
        return this.nomeSocial;
    }
}