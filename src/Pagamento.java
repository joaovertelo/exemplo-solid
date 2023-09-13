package com.devertelo.solid;

public record Pagamento(long valor, int parcela, TipoPagamento tipo, String conta) {
}
