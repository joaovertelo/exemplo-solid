public class PagamentoService {

    public void realizarPagamento(Pagamento pagamento) {

        if (TipoPagamento.CREDITO.equals(pagamento.tipo())) {
            validarAntifraude(pagamento);
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

    public void validarAntifraude(Pagamento pagamento) {
        if (pagamento.valor() > 10000L) {
            throw new RuntimeException("pagamento não aprovado pelo anti-fraude");
        }
    }

    public void pagar(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }

    public void enviarComprovante(Pagamento pagamento) {
        System.out.println("Comprovante para o pagamento realizado no " + pagamento.tipo().toString() + " no valor de "
                + pagamento.valor() + " enviado para a conta " + pagamento.conta());
    }
}
