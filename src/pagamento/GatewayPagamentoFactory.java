package pagamento;

public class GatewayPagamentoFactory {

    public static PagamentoService getPagamentoService(TipoPagamento tipoPagamento) {
        if (TipoPagamento.CREDITO.equals(tipoPagamento)) {
            return new PagamentoCartaoService();
        } else if (TipoPagamento.DEBITO.equals(tipoPagamento)) {
            return new PagamentoDinheiroService();
        }
        throw new UnsupportedOperationException("método de pagamento não suportado");
    }
}
