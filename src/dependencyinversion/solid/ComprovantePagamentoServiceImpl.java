package dependencyinversion.solid;

public class ComprovantePagamentoServiceImpl implements ComprovantePagamentoService {
    @Override
    public void enviar(String conta, Long valor) {
        System.out.println("Comporvante de pagamento no valor de " + valor + " enviado para conta " + conta);
    }
}
