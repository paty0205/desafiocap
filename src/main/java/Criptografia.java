import java.util.*;

/*
Questão 3 - Lê o texto digitado pelo usuário, insere em uma matriz, e devolve o resultado criptografado
 */

public class Criptografia {
    private String frase;

    public Criptografia(String frase) {
        this.frase = frase;
    }

    public String Calcular() {
        String frase = this.frase.replaceAll("\\s+", "");
        int tamanho = frase.length();
        double raiz = Math.sqrt(tamanho);
        int maior = ((int) Math.ceil(raiz));
        int menor = ((int) Math.floor(raiz));
        String letras[][];
        int contador = 0;
        String resultado = "";
        if (menor * menor >= tamanho) {
            letras = new String[menor][menor];
        } else if (menor * maior >= tamanho) {
            letras = new String[menor][maior];
        } else {
            letras = new String[maior][maior];
        }

        for (int x = 0; x < letras.length && contador < tamanho; x++) {
            for (int y = 0; y < letras[x].length && contador < tamanho; y++) {
                letras[x][y] = frase.substring(contador, contador + 1);
                contador++;
            }
        }

        int x = 0;
        int y = 0;
        int tamanhoColuna = letras[y].length;
        int tamanhoLinha = letras.length;
        while (y < tamanhoColuna) {
            while (x < tamanhoLinha) {
                resultado += letras[x][y] == null ? "" : letras[x][y];
                x++;
            }
            resultado += y < tamanhoColuna - 1 ? " " : "";
            y++;
            x = 0;
        }
        return resultado;
    }
}
