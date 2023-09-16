package dependencyinversion.solid;

import openclosed.solid.CalculoPagamento;

public class PagamentoService {

    private final dependencyinversion.solid.GatewayPagamentoService gatewayPagamentoService;
    private final dependencyinversion.solid.ComprovantePagamentoService comprovantePagamentoService;
    private final CalculoPagamento calculoPagamento;

    public PagamentoService(GatewayPagamentoService gatewayPagamentoService, ComprovantePagamentoService comprovantePagamentoService, CalculoPagamento calculoPagamento) {
        this.gatewayPagamentoService = gatewayPagamentoService;
        this.comprovantePagamentoService = comprovantePagamentoService;
        this.calculoPagamento = calculoPagamento;
    }

    public void realizarPagamento(String conta, Long valor) {

        Long valorTotal = calculoPagamento.calcular(valor);

        gatewayPagamentoService.pagar(conta, valorTotal);

        comprovantePagamentoService.enviar(conta, valorTotal);
    }

}
