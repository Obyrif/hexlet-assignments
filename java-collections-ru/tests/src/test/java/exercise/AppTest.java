package exercise;

//import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
//import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    public void testRight() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> result = Implementations.right(elements, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testRightWithEmptyList() {
        List<Integer> elements = new ArrayList<>();

        List<Integer> expected = new ArrayList<>();

        List<Integer> result = Implementations.right(elements, 3);

        assertEquals(expected, result);
    }

    @Test
    public void testRightWithCountGreaterThanLength() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);

        List<Integer> result = Implementations.right(elements, 5);

        assertEquals(expected, result);
    }

    @Test
    public void testWrong1() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> result = Implementations.wrong1(elements, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testWrong1WithEmptyList() {
        List<Integer> elements = new ArrayList<>();

        List<Integer> expected = new ArrayList<>();
        expected.add(0);

        List<Integer> result = Implementations.wrong1(elements, 3);

        assertEquals(expected, result);
    }

    @Test
    public void testWrong2() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> result = Implementations.wrong2(elements, 2);

        assertEquals(expected, result);
    }

    @Test
    public void testWrong2WithEmptyList() {
        List<Integer> elements = new ArrayList<>();

        List<Integer> expected = new ArrayList<>();
        expected.add(100);

        List<Integer> result = Implementations.wrong2(elements, 3);

        assertEquals(expected, result);
    }

    @Test
    public void testWrong3() {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        elements.add(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> result = Implementations.wrong3(elements, 2);

        assertEquals(expected, result);
    }
    @Test
    public void testWrong3WithEmptyList() {
        List<Integer> elements = new ArrayList<>();

        List<Integer> expected = new ArrayList<>();

        List<Integer> result = Implementations.wrong3(elements, 3);

        assertEquals(expected, result);
    }
}
