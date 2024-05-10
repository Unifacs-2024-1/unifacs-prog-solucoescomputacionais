public class App {
    public static void main(String[] args) throws Exception {
        Ligacao ligacao = new Ligacao("123456789", "987654321", "Lisboa", "Porto", "10:00");
        System.out.println("Número de origem: " + ligacao.getNumOrigem());
        System.out.println("Número de destino: " + ligacao.getNumDestino());
        System.out.println("Local de origem: " + ligacao.getLocalOrigem());
        System.out.println("Local de destino: " + ligacao.getLocalDestino());
        System.out.println("Hora de início: " + ligacao.getHoraInicio());
        System.out.println("Hora de fim: " + ligacao.getHoraFim());

        ligacao.setHoraFim("10:20:35");
        System.out.println("Hora de fim: " + ligacao.getHoraFim());
    }
}
