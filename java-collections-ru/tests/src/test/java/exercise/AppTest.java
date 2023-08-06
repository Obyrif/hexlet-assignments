package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN

        @Test
        void rightshouldReturnSelectedElements() {
            List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
            int count = 3;

            List<Integer> expected = Arrays.asList(1, 2, 3);
            List<Integer> actual = Right.right(elements, count);

            assertEquals(expected, actual);
        }

        @Test
        void rightshouldReturnAllElementsWhenCountExceedsLength() {
            List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
            int count = 10;

            List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> actual = Right.right(elements, count);

            assertEquals(expected, actual);
        }

        @Test
        void rightshouldReturnEmptyListWhenCountIsZero() {
            List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
            int count = 0;

            List<Integer> expected = new ArrayList<>();
            List<Integer> actual = Right.right(elements, count);

            assertEquals(expected, actual);
        }

        @Test
        void rightshouldReturnEmptyListWhenElementsIsEmpty() {
            List<Integer> elements = new ArrayList<>();
            int count = 5;

            List<Integer> expected = new ArrayList<>();
            List<Integer> actual = Right.right(elements, count);

            assertEquals(expected, actual);
        }
        // END
    }
}
