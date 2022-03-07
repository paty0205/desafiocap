import java.util.Scanner;

/*
Questão 2 - Um array é gerado automaticamente a partir do tamanho informado pelo usuário
Um valor de X é informado pelo usuário
O algoritmo determina o número de elementos pares do vetor que tem uma diferença igual ao valor informado de X
 */

public class ParesDeNumeros {

    private String tamanho;
    private String x;

    public ParesDeNumeros(String tamanho, String x) {
        this.tamanho = tamanho;
        this.x = x;
    }

    public int Calcular() {
        int[] numeros = Biblioteca.NumerosAleatorios(Integer.parseInt(this.tamanho));
        System.out.println("Array de números: " + Biblioteca.ImprimirArray(numeros));
        int contador = 0;
        for (int z = 0; z < numeros.length; z++) {
            for (int y = z + 1; y < numeros.length; y++) {
                if (Math.abs(numeros[z] - numeros[y]) == Integer.parseInt(this.x)) {
                    contador++;
                }
                ;
            }
        }
        return contador;
    }

    public static boolean ValidarX(String x) {
        return x.matches("[1-9]*");
    }

    public static boolean ValidarTamanho(String tamanho) {
        if (!tamanho.matches("[1-9]*")) {
            return false;
        } else {
            int tamanhoNumero = Integer.parseInt(tamanho);
            return tamanhoNumero > 1 && tamanhoNumero < 21;
        }
    }

}
