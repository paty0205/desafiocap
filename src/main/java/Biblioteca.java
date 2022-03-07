import java.util.*;

public class Biblioteca {

    /*
    Método para gerar um array de números aleatórios de 1 a 100, sendo que o número de posições
    será informado pelo usuário
     */
    public static int[] NumerosAleatorios(int tamanho) {
        Random random = new Random();
        int numeros[] = new int[tamanho];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 1 + random.nextInt(100);
        }
        return numeros;
    }


    /*
    Função para imprimir o conteúdo dos arrays
    */

    public static String ImprimirArray(int[] numeros) {
        String impResultado = "[ ";
        for (int x = 0; x < numeros.length; x++) {
            impResultado += numeros[x] + " ";
        }
        impResultado += "]";
        return impResultado;
    }
}

