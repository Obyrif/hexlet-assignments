package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        int numberOfElements = 3;
        List<Integer> result = Take.take(inputList, numberOfElements);
        assertEquals(Arrays.asList(1, 2, 3), result);
        // END
    }
}
