package comprovante;

import pagamento.Pagamento;

public class ComprovanteService {
    public void enviarComprovante(Pagamento pagamento) {
        System.out.println("Comprovante para o pagamento realizado no " + pagamento.tipo().toString() + " no valor de "
                + pagamento.valor() + " enviado para a conta " + pagamento.conta());
    }
}
