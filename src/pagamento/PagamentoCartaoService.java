package pagamento;

import antifraude.AntifraudeService;
import comprovante.ComprovanteService;
import pagamento.calculo.CalculoPagamentoCartao;

public class PagamentoCartaoService implements PagamentoService {

    @Override
    public void realizarPagamento(Pagamento pagamento) {

        PagamentoCartao pagamentoCartao = (PagamentoCartao) pagamento;

        new AntifraudeService().validar(pagamentoCartao);

        Long valorPagamento = new CalculoPagamentoCartao().calcular(pagamento);

        new GatewayPagamento().enviarPagamento(valorPagamento, pagamento.conta());

        new ComprovanteService().enviarComprovante(pagamento);
    }
}
