package pagamento;

public interface Pagamento {
    long valor();

    TipoPagamento tipo();

    String conta();
}
