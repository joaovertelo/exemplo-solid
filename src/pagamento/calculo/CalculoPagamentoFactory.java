package pagamento.calculo;

import pagamento.TipoPagamento;

public class CalculoPagamentoFactory {

    public static CalculoPagamento getCalculoPagamento(TipoPagamento tipoPagamento) {
        if (TipoPagamento.CREDITO.equals(tipoPagamento)) {
            return new CalculoPagamentoCredito();
        } else if (TipoPagamento.DEBITO.equals(tipoPagamento)) {
            return new CalculoPagamentoDebito();
        }
        throw new UnsupportedOperationException("método de pagamento não suportado");
    }
}
