import java.sql.SQLOutput;
import java.util.*;

public class SATmap {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        Set<Integer> uniqueEvenNumbers = new TreeSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }
        for (int num : uniqueEvenNumbers) {
            System.out.println(num);
        }
    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}
