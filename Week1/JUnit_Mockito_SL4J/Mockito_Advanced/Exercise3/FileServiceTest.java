package Week1.JUnit_Mockito_SL4J.Mockito_Advanced.Exercise3;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class FileServiceTest {

    @Test
    void testServiceWithMockFileIO() {

        FileReader mockReader = mock(FileReader.class);
        FileWriter mockWriter = mock(FileWriter.class);

        when(mockReader.read())
                .thenReturn("Mock File Content");

        FileService fileService =
                new FileService(mockReader, mockWriter);

        String result = fileService.processFile();

        verify(mockWriter).write("Mock File Content");

        assertEquals(
                "Processed Mock File Content",
                result
        );
    }
}
