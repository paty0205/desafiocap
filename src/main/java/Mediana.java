import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/*
Questão 1 - Um array é gerado automaticamente com o tamanho informado pelo usuário, que precisa ser um
número impar.
O algoritmo devolve a mediana.
 */

public class Mediana {
    private String entrada;

    public Mediana(String entrada) {
        this.entrada = entrada;
    }

    public int Calcular() {
        int tamanho = Integer.parseInt(this.entrada);
        int[] numeros = Biblioteca.NumerosAleatorios(tamanho);
        System.out.println("Array de números: " + Biblioteca.ImprimirArray(numeros));
        Arrays.sort(numeros);
        int metade = Math.round(numeros.length / 2);
        return numeros[metade];
    }

    public boolean ValidarEntrada() {
        if (!this.entrada.matches("[1-9]*")) {
            return false;
        } else {
            int tamanho = Integer.parseInt(this.entrada);
            return tamanho > 2 && tamanho < 16 && tamanho % 2 != 0;
        }
    }
}
