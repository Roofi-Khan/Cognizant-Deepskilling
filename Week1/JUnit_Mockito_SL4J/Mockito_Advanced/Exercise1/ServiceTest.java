package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {

        Repository mockRepository = mock(Repository.class);

        when(mockRepository.getData())
                .thenReturn("Mock Data");

        Service service = new Service(mockRepository);

        String result = service.processData();

        assertEquals("Processed Mock Data", result);
    }
}