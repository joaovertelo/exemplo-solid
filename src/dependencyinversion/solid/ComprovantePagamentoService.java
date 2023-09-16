package dependencyinversion.solid;

public interface ComprovantePagamentoService {
    void enviar(String conta, Long valor);
}
