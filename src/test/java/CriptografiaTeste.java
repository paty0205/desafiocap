import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CriptografiaTeste {
    @Test
    void Criptografia_Frase_Valida(){
        //Arrange
        String resultado;
        Criptografia criptografia = new Criptografia("Tenha um bom dia");
        //Act
        resultado = criptografia.Calcular();

        //Assert
        assertEquals("Taoa eum nmd hbi", resultado);
    }
}
