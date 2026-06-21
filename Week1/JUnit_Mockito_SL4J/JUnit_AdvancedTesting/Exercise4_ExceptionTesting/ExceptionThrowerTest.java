package Week1.JUnit_Mockito_SL4J.JUnit_AdvancedTesting.Exercise4_ExceptionTesting;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    ExceptionThrower obj = new ExceptionThrower();

    @Test
    void testException() {

        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> obj.throwException()
        );

        assertEquals("Invalid input", exception.getMessage());
    }
}
