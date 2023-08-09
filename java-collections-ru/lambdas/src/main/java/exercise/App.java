package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[][] enlargeArrayImage(String[][] array) {
        int rows = array.length;
        int cols = array[0].length;

        String[][] image = new String[rows * 2][cols * 2];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String pix = array[i][j];

                image[i * 2][j * 2] = pix;
                image[i * 2 + 1][j * 2] = pix;
                image[i * 2][j * 2 + 1] = pix;
                image[i * 2 + 1][j * 2 + 1] = pix;
            }
        }
        return image;
    }
}
// END
