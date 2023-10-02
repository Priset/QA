package tarea1MocksTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import tarea1Mocks.ASFIService;
import tarea1Mocks.Banco;

public class BancoTest {
    ASFIService asfiMock = Mockito.mock(ASFIService.class);
    @Test
    public void verifyMaximoPrestamo() {
        // PASO 3 > le decimos al método que queremos que retorne
        Mockito.when(asfiMock.getCategoria("454566")).thenReturn("A");
        Mockito.when(asfiMock.getCategoria("999999")).thenReturn("B");
        Mockito.when(asfiMock.getCategoria("77777")).thenReturn("C");

        // PASO 4 > usar el objeto mockeado
        Banco banco = new Banco();
        banco.setAsfiService(asfiMock);

        // Realizando tests
        Assertions.assertEquals(200000, banco.getMaximoPrestamo("454566"));
        Assertions.assertEquals(100000, banco.getMaximoPrestamo("999999"));
        Assertions.assertThrows(IllegalStateException.class, () -> banco.getMaximoPrestamo("77777"));

        // PASO 5  verificar que el mock y los métodos mockeados se usen
        Mockito.verify(asfiMock).getCategoria("454566");
        Mockito.verify(asfiMock).getCategoria("999999");
        Mockito.verify(asfiMock).getCategoria("77777");
    }
}
