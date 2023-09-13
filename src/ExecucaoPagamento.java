package com.devertelo.solid;

public class ExecucaoPagamento {

    public static void main(String[] args) {
        PagamentoService service = new PagamentoService();

        service.realizarPagamento(new Pagamento(100l,1, TipoPagamento.DEBITO, "101010"));
    }
}
