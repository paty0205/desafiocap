import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class ParesDeNumerosTeste {
    @Test
    void ParesDeNumerosTeste_Validar_Tamanho_Letras() {
        //Arrange
        boolean resultado;

        //Act
        resultado = ParesDeNumeros.ValidarTamanho("ggg");

        //Assert
        assertFalse(resultado);
    }

    @Test
    void ParesDeNumerosTeste_Validar_X_Letras() {
        //Arrange
        boolean resultado;

        //Act
        resultado = ParesDeNumeros.ValidarX("ggg");

        //Assert
        assertFalse(resultado);
    }
}
