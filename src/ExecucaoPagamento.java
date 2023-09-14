import pagamento.Pagamento;
import pagamento.GatewayPagamento;
import pagamento.TipoPagamento;

public class ExecucaoPagamento {

    public static void main(String[] args) {
        GatewayPagamento service = new GatewayPagamento();

        service.realizarPagamento(new Pagamento(100l, 1, TipoPagamento.DEBITO, "101010"));
    }
}
