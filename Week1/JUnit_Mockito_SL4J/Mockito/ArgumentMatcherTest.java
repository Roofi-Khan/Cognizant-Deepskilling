package Week1.JUnit_Mockito_SL4J.Mockito;



import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ArgumentMatcherTest {

    @Test
    void testArgumentMatching() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getUser(anyString()))
                .thenReturn("John");

        MyService service = new MyService(mockApi);

        service.getUser("Alice");

        verify(mockApi).getUser(anyString());
    }
}