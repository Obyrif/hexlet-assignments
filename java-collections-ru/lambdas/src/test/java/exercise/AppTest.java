package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


// BEGIN

public class AppTest {

    @Test
    public void testEnlargedArrayImage() {
        String[][] originalArray = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };

        String[][] expectedArray = {
                {"*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*"},
        };

        String[][] enlargedArray = App.enlargeArrayImage(originalArray);
        assertArrayEquals(expectedArray, enlargedArray);
    }
}

// END
