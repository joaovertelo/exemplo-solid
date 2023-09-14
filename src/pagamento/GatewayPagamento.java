package pagamento;

import comprovante.ComprovanteService;
import pagamento.calculo.CalculoPagamento;
import pagamento.calculo.CalculoPagamentoFactory;

public class GatewayPagamento {

    public void realizarPagamento(Pagamento pagamento) {

        CalculoPagamento calculoPagamento = CalculoPagamentoFactory.getCalculoPagamento(pagamento.tipo());

        Long valorPagamento = calculoPagamento.calcular(pagamento);

        enviarPagamento(valorPagamento, pagamento.conta());

        new ComprovanteService().enviarComprovante(pagamento);
    }

    public void enviarPagamento(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }
}
