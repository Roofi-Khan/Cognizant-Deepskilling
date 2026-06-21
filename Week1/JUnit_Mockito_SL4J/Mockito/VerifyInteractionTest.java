package Week1.JUnit_Mockito_SL4J.Mockito;


import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VerifyInteractionTest {

    @Test
    void testVerifyInteraction() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi).getData();
    }
}