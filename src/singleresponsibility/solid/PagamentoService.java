package singleresponsibility.solid;

public class PagamentoService {

    private final GatewayPagamentoService gatewayPagamentoService;
    private final ComprovantePagamentoService comprovantePagamentoService;

    public PagamentoService() {
        this.gatewayPagamentoService = new GatewayPagamentoService();
        this.comprovantePagamentoService = new ComprovantePagamentoService();
    }

    public void realizarPagamento(String conta, Long valor) {

        gatewayPagamentoService.pagar(conta, valor);

        comprovantePagamentoService.enviar(conta, valor);
    }
}
