import java.util.*;
import org.json.*;
import java.nio.file.*;

public class desafio3 {
    public static void main(String[] args) throws Exception {
        String json = Files.readString(Paths.get("faturamento.json"));
        JSONArray faturamento = new JSONArray(json);

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        List<Double> valoresValidos = new ArrayList<>();

        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.optDouble(i, 0);
            if (valor > 0) {
                valoresValidos.add(valor);
                menor = Math.min(menor, valor);
                maior = Math.max(maior, valor);
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        long diasAcimaMedia = valoresValidos.stream().filter(v -> v > media).count();

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Dias acima da média: " + diasAcimaMedia);
    }
}

