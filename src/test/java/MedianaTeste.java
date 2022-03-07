import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class MedianaTeste {


    /*
      Testa o Método ValidarEntrada para Letras, Números Pares e Intervalos entre 3 e 15
     */
    @Test
    void Mediana_Validar_Entrada_Letras() {
        //Arrange
        boolean resultado;
        Mediana mediana = new Mediana("ggg");
        //Act
        resultado = mediana.ValidarEntrada();

        //Assert
        assertFalse(resultado);
    }

    @Test
    void Mediana_Validar_Entrada_Par() {
        //Arrange
        boolean resultado;
        Mediana mediana = new Mediana("4");

        //Act
        resultado = mediana.ValidarEntrada();

        //Assert
        assertFalse(resultado);

    }

    @Test
    void Mediana_Validar_Entrada_Intervalo_Menor() {
        //Arrange
        Mediana mediana = new Mediana("1");
        boolean resultado;

        //Act
        resultado = mediana.ValidarEntrada();

        //Assert
        assertFalse(resultado);

    }

    @Test
    void Mediana_Validar_Entrada_Intervalo_Maior() {
        //Arrange
        Mediana mediana = new Mediana("16");
        boolean resultado;

        //Act
        resultado = mediana.ValidarEntrada();

        //Assert
        assertFalse(resultado);

    }

    @Test
    void Mediana_Validar_Entrada_Intervalo_Valido() {
        //Arrange
        Mediana mediana = new Mediana("5");
        boolean resultado;

        //Act
        resultado = mediana.ValidarEntrada();

        //Assert
        assertEquals(true, resultado);

    }

}