package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        // Приводим все символы к нижнему регистру
        letters = letters.toLowerCase();
        word = word.toLowerCase();

        // Создаем список для хранения символов в наборе
        ArrayList<Character> letterList = new ArrayList<>();

        // Заполняем список символами из набора
        for (char c : letters.toCharArray()) {
            letterList.add(c);
        }

        // Проверяем, достаточно ли символов для составления слова
        for (char c : word.toCharArray()) {
            if (!letterList.remove(Character.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}
//END
