package Week1.JUnit_Mockito_SL4J.Mockito;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MultipleReturnTest {

    @Test
    void testMultipleReturns() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
                .thenReturn("First")
                .thenReturn("Second")
                .thenReturn("Third");

        assertEquals("First", mockApi.getData());
        assertEquals("Second", mockApi.getData());
        assertEquals("Third", mockApi.getData());
    }
}