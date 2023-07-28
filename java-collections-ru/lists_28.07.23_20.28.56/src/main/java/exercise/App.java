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

        // Создаем массив для хранения количества каждого символа в наборе
        int[] letterCount = new int[26];

        // Заполняем массив количеством символов в наборе
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            letterCount[c - 'a']++;
        }

        // Проверяем, достаточно ли символов для составления слова
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (letterCount[c - 'a'] == 0) {
                return false;
            }
            letterCount[c - 'a']--;
        }

        return true;
    }
}
//END
