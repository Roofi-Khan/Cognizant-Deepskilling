package Week1.JUnit_Mockito_SL4J.Mockito;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class InteractionOrderTest {

    @Test
    void testOrder() {

        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.getData();
        mockApi.getUser("John");

        InOrder inOrder = inOrder(mockApi);

        inOrder.verify(mockApi).getData();
        inOrder.verify(mockApi).getUser("John");
    }
}