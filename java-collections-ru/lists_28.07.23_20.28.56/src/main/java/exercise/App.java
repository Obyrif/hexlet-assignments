package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String randomWord, String world) {
        List<Character> randomWord = new ArrayList<>();
        List<Character> world = new ArrayList<>();
        int count = 0;

        char[] randomWordArray = randomWord.toCharArray();
        char[] worldArray = world.toCharArray();

        for(char c: randomWordArray) {
            randomChars.add(c);
        }
        for(char c: worldArray) {
            worldChars.add(c);
        }
        for(char c: worldChars) {
            if(randomChars.contains(c)) {
                count++;
                randomChars.remove(Charter.valueOf(c));
            } else {
                return false;
            }
        }
        if(count == worldChar.size()) {
            return true;
        } else {
            return false;
        }
    }
}
//END
