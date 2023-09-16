package openclosed.normal;

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

        Long valorTotal = new CalculoPagamento().calcular(valor, tipoPagamento);

        gatewayPagamentoService.pagar(conta, valorTotal);

        comprovantePagamentoService.enviar(conta, valorTotal);
    }
}
