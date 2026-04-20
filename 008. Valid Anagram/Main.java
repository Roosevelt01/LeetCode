package LeetCode.Valid_anagram;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> contenedor = new HashMap<>();

        for (char letra : s.toCharArray()) {
            contenedor.put(letra, contenedor.getOrDefault(letra, 0) + 1);
        }

        for (char letra : t.toCharArray()) {
            Integer contador = contenedor.get(letra);

            if (contador == null || contador == 0) {
                return false;
            }

            contenedor.put(letra, contador - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.isAnagram("anagram", "nagaram")); // true
        System.out.println(main.isAnagram("rat", "car")); // false

    }
}