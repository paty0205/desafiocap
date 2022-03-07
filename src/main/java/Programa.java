import java.util.Scanner;

/*
Programa principal que faz a chamada das questões, e imprime os resultados.
 */

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int questao = 0;
        do {
            System.out.println("Digite uma opção de 1 a 3 ou 0 para sair: ");
            questao = teclado.nextInt();
            switch (questao) {
                case 0:
                    break;

                case 1:
                    Mediana mediana;
                    Scanner tecladoMediana = new Scanner(System.in);
                    do {
                        System.out.println("Digite um número impar de 3 a 15: ");
                        String entrada = tecladoMediana.nextLine();
                        mediana = new Mediana(entrada);
                    } while (!mediana.ValidarEntrada());
                    System.out.println(" A mediana é: " + mediana.Calcular());
                    break;

                case 2:
                    Scanner tecladoParesDeNumeros = new Scanner(System.in);
                    String tamanho;
                    String x;
                    do {
                        System.out.println("Digite um número de 2 a 20: ");
                        tamanho = tecladoParesDeNumeros.nextLine();
                    } while (!ParesDeNumeros.ValidarTamanho(tamanho));
                    do {
                        System.out.println("Digite o valor de X: ");
                        x = tecladoParesDeNumeros.nextLine();
                    } while (!ParesDeNumeros.ValidarX(x));
                    ParesDeNumeros paresDeNumeros = new ParesDeNumeros(tamanho, x);
                    System.out.println("Número de elementos pares: " + paresDeNumeros.Calcular());
                    break;

                case 3:
                    Scanner tecladoCriptografia = new Scanner(System.in);
                    System.out.println("Digite uma frase para Criptografia: ");
                    String s = tecladoCriptografia.nextLine();
                    Criptografia criptografia = new Criptografia(s);
                    System.out.println("Frase criptografada: " + criptografia.Calcular());
                    break;
                default:
                    break;
            }
        } while (questao != 0);
    }
}
