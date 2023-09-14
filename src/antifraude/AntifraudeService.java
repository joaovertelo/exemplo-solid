package antifraude;

import pagamento.Pagamento;

public class AntifraudeService {

    public void validar(Pagamento pagamento) {
        if (pagamento.valor() > 10000L) {
            throw new RuntimeException("pagamento não aprovado pelo anti-fraude");
        }
    }
}
