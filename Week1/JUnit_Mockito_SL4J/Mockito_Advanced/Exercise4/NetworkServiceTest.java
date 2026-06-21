package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise4;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class NetworkServiceTest {

    @Test
    void testServiceWithMockNetworkClient() {

        NetworkClient mockClient =
                mock(NetworkClient.class);

        when(mockClient.connect())
                .thenReturn("Mock Connection");

        NetworkService networkService =
                new NetworkService(mockClient);

        String result =
                networkService.connectToServer();

        assertEquals(
                "Connected to Mock Connection",
                result
        );
    }
}