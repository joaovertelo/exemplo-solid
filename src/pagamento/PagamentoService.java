package pagamento;

import antifraude.AntifraudeService;
import comprovante.ComprovanteService;

public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento) {

        if (TipoPagamento.CREDITO.equals(pagamento.tipo())) {
            new AntifraudeService().validar(pagamento);
            Long valorCredito = null;
            if (pagamento.parcela() == 1) {
                valorCredito = (long) (pagamento.valor() * 1.1);
            } else {
                valorCredito = (long) (pagamento.valor() * 1.2);
            }
            enviarPagamento(valorCredito, pagamento.conta());
        }
        if (TipoPagamento.DEBITO.equals(pagamento.tipo())) {
            long valorDebito = (long) (pagamento.valor() * 0.9);
            enviarPagamento(valorDebito, pagamento.conta());
        }

        new ComprovanteService().enviarComprovante(pagamento);
    }

    public void enviarPagamento(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }
}
