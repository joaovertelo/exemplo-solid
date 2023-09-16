package openclosed.normal;

import pagamento.TipoPagamento;

public class CalculoPagamento {

    public Long calcular(Long valor, TipoPagamento tipoPagamento) {
        Long valorTotal = null;

        if (TipoPagamento.DEBITO.equals(tipoPagamento)) {
            valorTotal = (long) (valor * 0.9);
        } else if (TipoPagamento.CREDITO.equals(tipoPagamento)) {
            valorTotal = (long) (valor * 1.1);
        }

        return valorTotal;
    }
}
