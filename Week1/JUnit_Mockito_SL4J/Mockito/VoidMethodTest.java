package Week1.JUnit_Mockito_SL4J.Mockito;


import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class VoidMethodTest {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi)
                   .sendMessage(anyString());

        MyService service = new MyService(mockApi);

        service.notifyUser("Hello");

        verify(mockApi).sendMessage("Hello");
    }
}