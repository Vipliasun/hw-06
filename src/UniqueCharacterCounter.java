import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterCounter {

    public static Map<String, Integer> countUniqueCharacters(String[] inputArray) {
        Map<String, Integer> result = new HashMap<>();

        for (String line : inputArray) {
            char[] charArray = line.toCharArray();

            Map<Character, Boolean> uniqueChars = new HashMap<>();

            for (char c : charArray) {
                uniqueChars.put(c, true);
            }
            int uniqueCount = uniqueChars.size();

            result.put(line, uniqueCount);
        }

        return result;
    }
}
