package exercise;

import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class AppTest {
    @Test
    void testTake() {
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> expected1 = Arrays.asList(1, 2);
        Assert.assertEquals(expected1, App.take(numbers1, 2));

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        List<Integer> expected2 = Arrays.asList(7, 3, 10);
        Assert.assertEquals(expected2, App.take(numbers2, 8));
    }
}
