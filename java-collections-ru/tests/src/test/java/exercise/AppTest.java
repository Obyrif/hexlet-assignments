package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake(List<Integer> list, int numberElement) {
        // BEGIN
        List<Integer> unput = new ArrayList<>();
        unput.add(1);
        unput.add(2);
        unput.add(3);
        int number = 2;
        List<Integer> result = App.take(unput,number);
        assertThat(result).containsExactly(1, 2);
        // END
    }
}
