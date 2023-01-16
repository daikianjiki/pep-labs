import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Integer, Character> map = new HashMap<>();

        char character = ' ';
        char value = ' ';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            map.put(i, character);
            while (map.containsValue(character)) {
                count
                value = map.get(i);
            }
        }
        return value;
    }
}
