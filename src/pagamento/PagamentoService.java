package pagamento;

import comprovante.ComprovanteService;

public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento) {

        Long valorPagamento = null;
        if (TipoPagamento.CREDITO.equals(pagamento.tipo())) {
            if (pagamento.parcela() == 1) {
                valorPagamento = (long) (pagamento.valor() * 1.1);
            } else {
                valorPagamento = (long) (pagamento.valor() * 1.2);
            }
        }
        if (TipoPagamento.DEBITO.equals(pagamento.tipo())) {
            valorPagamento = (long) (pagamento.valor() * 0.9);
        }

        enviarPagamento(valorPagamento, pagamento.conta());

        new ComprovanteService().enviarComprovante(pagamento);
    }

    private void enviarPagamento(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }
}
