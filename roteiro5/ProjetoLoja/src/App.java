public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja(
            "nomeFantasia",
            "razaoSocial",
            "cnpj"
        );
        // Parte 2
        Loja loja2 = new Loja(
            "nomeFantasia", "cnpj"
        );
    }
}
