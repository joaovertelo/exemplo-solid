public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento) {

        Long valorPagamento = null;
        if (TipoPagamento.CREDITO.equals(pagamento.tipo())) {
            if (pagamento.parcela() == 1) {
                valorPagamento = (long) (pagamento.valor() * 1.1);
            } else {
                valorPagamento = (long) (pagamento.valor() * 1.2);
            }
        } else if (TipoPagamento.DEBITO.equals(pagamento.tipo())) {
            valorPagamento = (long) (pagamento.valor() * 0.9);
        }
        pagar(valorPagamento, pagamento.conta());

        enviarComprovante(pagamento);
    }

    public void pagar(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }

    public void enviarComprovante(Pagamento pagamento) {
        System.out.println("Comprovante para o pagamento realizado no " + pagamento.tipo().toString() + " no valor de "
                + pagamento.valor() + " enviado para a conta " + pagamento.conta());
    }
}
