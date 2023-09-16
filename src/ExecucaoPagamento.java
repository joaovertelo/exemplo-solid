import pagamento.*;

public class ExecucaoPagamento {

    public static void main(String[] args) {


        Pagamento pagamento = new PagamentoRequest(100l, TipoPagamento.DEBITO, "101010");

        PagamentoService pagamentoService = GatewayPagamentoFactory.getPagamentoService(pagamento.tipo());

        pagamentoService.realizarPagamento(pagamento);
    }
}
