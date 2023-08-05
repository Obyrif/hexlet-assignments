package exercise;

//import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
//import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;


class AppTest {
    @Test
    void testTake() {
        // Arrange
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int numberOfElements = 3;

        // Act
        List<Integer> result = Take.take(inputList, numberOfElements);

        // Assert
        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void testTake_EmptyList() {
        // Arrange
        List<Integer> inputList = Arrays.asList();
        int numberOfElements = 3;

        // Act
        List<Integer> result = Take.take(inputList, numberOfElements);

        // Assert
        assertEquals(Arrays.asList(), result);
    }

    @Test
    void testTake_NumberOfElementsGreaterThanListSize() {
        // Arrange
        List<Integer> inputList = Arrays.asList(1, 2, 3);
        int numberOfElements = 5;

        // Act
        List<Integer> result = Take.take(inputList, numberOfElements);

        // Assert
        assertEquals(Arrays.asList(1, 2, 3), result);
    }
}
