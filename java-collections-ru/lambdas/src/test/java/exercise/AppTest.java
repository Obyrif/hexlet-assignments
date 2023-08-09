package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
import org.junit.Test;
import static org.junit.Assert.*;

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
