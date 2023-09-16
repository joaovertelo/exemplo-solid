package pagamento;

public record PagamentoCartaoRequest(long valor, TipoPagamento tipo, String conta,
                                     int parcela) implements PagamentoCartao {

}
