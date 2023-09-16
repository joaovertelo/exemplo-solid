package singleresponsibility.solid;

public class GatewayPagamentoService {

    public void pagar(String conta, Long valor) {
        System.out.println("Pagamento de " + valor + " enviado para conta " + conta);
    }

}
