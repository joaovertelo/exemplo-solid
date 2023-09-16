package openclosed.solid;

public class CalculoPagamentoDebito implements CalculoPagamento {
    @Override
    public Long calcular(Long valor) {
        return (long) (valor * 0.9);
    }
}
