package pagamento.calculo;

import pagamento.PagamentoCartao;
import pagamento.Pagamento;

public class CalculoPagamentoCartao implements CalculoPagamento {

    @Override
    public Long calcular(Pagamento pagamento) {
        if (((PagamentoCartao) pagamento).parcela() == 1) {
            return (long) (pagamento.valor() * 1.1);
        }
        return (long) (pagamento.valor() * 1.2);
    }

}
