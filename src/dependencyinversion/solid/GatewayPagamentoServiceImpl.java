package dependencyinversion.solid;

public class GatewayPagamentoServiceImpl implements GatewayPagamentoService {

    public void pagar(String conta, Long valor) {
        System.out.println("Pagamento de " + valor + " enviado para conta " + conta);
    }

}
