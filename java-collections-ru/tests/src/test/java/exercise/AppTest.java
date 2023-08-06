package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void rightTest() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        int count = 3;

        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Implementations.right(elements, count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void wrong1Test() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        int count = 3;

        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Implementations.wrong1(elements, count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void wrong2Test() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        int count = 3;

        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Implementations.wrong2(elements, count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void wrong3Test() {
        List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5);
        int count = 3;

        List<Integer> expected = Arrays.asList(1, 2, 3);
        List<Integer> actual = Implementations.wrong3(elements, count);

        Assertions.assertEquals(expected, actual);
    }
}

