package interfacesegregation.solid;

public class CalculoPagamentoCredito implements CalculoPagamento {

    @Override
    public Long calcular(Long valor) {
        return (long) (valor * 1.1);
    }

}
