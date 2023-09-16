package pagamento.calculo;

import pagamento.Pagamento;

public class CalculoPagamentoDinheiro implements CalculoPagamento {
    @Override
    public Long calcular(Pagamento pagamento) {
        return (long) (pagamento.valor() * 0.9);
    }
}
