package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();

        ArrayList<Character> letterList = new ArrayList<>();

        for (char c : letters.toCharArray()) {
            letterList.add(c);
        }
        for (char c : word.toCharArray()) {
            if (!letterList.remove(Character.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
//END
