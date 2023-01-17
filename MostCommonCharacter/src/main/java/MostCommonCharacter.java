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
        // Map<Character, Integer> map = new HashMap<>();
        // char key = ' ';
        // int value = 0;
        // for (int i = 0; i < str.length(); i++) {
        //     key = str.charAt(i);
        //     if (map.containsKey(key)) {
        //         value = value + 1;
        //         map.put(key, value);
        //     } else {
        //         map.put(key, 1);
        //     }
            
        // }
        // return key;
        char maxChar = ' ';
        int maxCount = 0;
        int[] charCount = new int[Character.MAX_VALUE+1];
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (++charCount[ch]>= maxCount) {
                maxCount = charCount[ch];
                maxChar = ch;
            }
        }
        return maxChar;
    }
}
