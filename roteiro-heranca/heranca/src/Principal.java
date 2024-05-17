public class Principal {
    public static void main(String[] args) throws Exception {
        VeiculoCarga vc = new VeiculoCarga("2222-BA", 2011, 5000);
        VeiculoPasseio vp = new VeiculoPasseio("3333-BA", 2012, 5);
        VeiculoPequeno vpe = new VeiculoPequeno("3333-BA", 2012, "moto");

        System.out.println(vc.calcPedagio());
        System.out.println(vp.calcPedagio());
        System.out.println(vpe.calcPedagio());
    }
}
