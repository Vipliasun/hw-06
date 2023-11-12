import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] inputArray = {"logo", "mama", "coco", "yes"};
        Map<String, Integer> result = UniqueCharacterCounter.countUniqueCharacters(inputArray);

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println("Line: " + entry.getKey() + ", Unique Characters: " + entry.getValue());
        }
    }
}