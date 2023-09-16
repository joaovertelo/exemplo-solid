package singleresponsibility.normal;

public class PagamentoService {

    public void realizarPagamento(String conta, Long valor) {

        pagar(conta, valor);

        enviarComprovante(conta, valor);
    }

    private void pagar(String conta, Long valor) {
        System.out.println("Pagamento de " + valor + " enviado para conta " + conta);
    }

    private void enviarComprovante(String conta, Long valor) {
        System.out.println("Comporvante de pagamento no valor de " + valor + " enviado para conta " + conta);
    }
}
