package pagamento;

import comprovante.ComprovanteService;
import pagamento.calculo.CalculoPagamentoDinheiro;

public class PagamentoDinheiroService implements PagamentoService {

    @Override
    public void realizarPagamento(Pagamento pagamento) {

        Long valorPagamento = new CalculoPagamentoDinheiro().calcular(pagamento);

        new GatewayPagamento().enviarPagamento(valorPagamento, pagamento.conta());

        new ComprovanteService().enviarComprovante(pagamento);
    }
}
