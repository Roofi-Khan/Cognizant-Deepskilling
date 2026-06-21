package Week1.JUnit_Mockito_SL4J.Mockito;



import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VoidExceptionTest {

    @Test
    void testVoidException() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doThrow(new RuntimeException("Delete failed"))
                .when(mockApi)
                .deleteData();

        assertThrows(
                RuntimeException.class,
                () -> mockApi.deleteData()
        );

        verify(mockApi).deleteData();
    }
}