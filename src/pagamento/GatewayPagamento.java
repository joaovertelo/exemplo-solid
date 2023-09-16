package pagamento;

public class GatewayPagamento {
    public void enviarPagamento(long valor, String conta) {
        System.out.println(valor + " pago para a conta " + conta);
    }
}
