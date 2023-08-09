package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        return Arrays.stream(array)
                .flatMap(row -> Arrays.stream(row).flatMap(pix -> Stream.of(pix, pix)))
                .map(pix -> new String[]{pix, pix})
                .toArray(String[][]::new);
    }
}
// END
