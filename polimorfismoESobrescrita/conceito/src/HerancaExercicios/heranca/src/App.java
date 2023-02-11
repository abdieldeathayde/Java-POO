public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingresso = new Ingresso();
        IngressoVip ingressoVip = new IngressoVip();

        ingresso.setValor((float) 30.50);
        ingressoVip.setValorAdicional((float) 60.50);

        System.out.println(ingresso.getValor());
        System.out.println(ingressoVip.getValorAdicional());


    }
}
