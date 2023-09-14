public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento) {

        if (TipoPagamento.CREDITO.equals(pagamento.tipo())) {
            Long valorCredito = null;
            if (pagamento.parcela() == 1) {
                valorCredito = (long) (pagamento.valor() * 1.1);
            } else {
                valorCredito = (long) (pagamento.valor() * 1.2);
            }
            pagar(valorCredito, pagamento.conta());
        }
        if (TipoPagamento.DEBITO.equals(pagamento.tipo())) {
            long valorDebito = (long) (pagamento.valor() * 0.9);
            pagar(valorDebito, pagamento.conta());
        }

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
