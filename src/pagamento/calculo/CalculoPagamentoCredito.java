package pagamento.calculo;

import pagamento.Pagamento;

public class CalculoPagamentoCredito implements CalculoPagamento {

    @Override
    public Long calcular(Pagamento pagamento) {
        if (pagamento.parcela() == 1) {
            return (long) (pagamento.valor() * 1.1);
        }
        return (long) (pagamento.valor() * 1.2);
    }
}
