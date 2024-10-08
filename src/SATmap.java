import java.sql.SQLOutput;
import java.util.*;

public class SATmap {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        task1(nums);
        System.out.println();

        task2(nums);
        System.out.println();

        task3(strings);
        System.out.println();

        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
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

    public static void task3(List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }
    public static void task4(List<String> strings) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
