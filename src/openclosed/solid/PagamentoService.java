package openclosed.solid;

import pagamento.TipoPagamento;
import singleresponsibility.solid.ComprovantePagamentoService;
import singleresponsibility.solid.GatewayPagamentoService;

public class PagamentoService {

    private final GatewayPagamentoService gatewayPagamentoService;
    private final ComprovantePagamentoService comprovantePagamentoService;

    public PagamentoService() {
        this.gatewayPagamentoService = new GatewayPagamentoService();
        this.comprovantePagamentoService = new ComprovantePagamentoService();
    }

    public void realizarPagamento(String conta, Long valor, TipoPagamento tipoPagamento) {

        Long valorTotal = getCalculoPagamento(tipoPagamento).calcular(valor);

        gatewayPagamentoService.pagar(conta, valorTotal);

        comprovantePagamentoService.enviar(conta, valorTotal);
    }

    private CalculoPagamento getCalculoPagamento(TipoPagamento tipoPagamento) {
        if (TipoPagamento.DEBITO.equals(tipoPagamento)) {
            return new CalculoPagamentoDebito();
        } else if (TipoPagamento.CREDITO.equals(tipoPagamento)) {
            return new CalculoPagamentoCredito();
        }
        throw new RuntimeException("tipo de pagamento inválido");
    }
}
