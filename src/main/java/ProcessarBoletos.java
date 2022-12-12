import java.net.URI;
import java.util.List;
import java.util.function.Function;

public class ProcessarBoletos {
    private Function<URI, List<Boleto>> leituraRetorno;

    public ProcessarBoletos(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(URI nomeArquivo) {
        List<Boleto> boletos = leituraRetorno.apply(nomeArquivo);
        boletos.forEach(System.out::println);
    }

    public void setLeituraRetorno(Function<URI, List<Boleto>> leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
