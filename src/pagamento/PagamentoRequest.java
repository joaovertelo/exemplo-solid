package pagamento;

public record PagamentoRequest(long valor, TipoPagamento tipo, String conta) implements Pagamento {

}
