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

        Collection.sort(nums);
        int prevNum = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num % 2 = &&num != prevNum){
                System.out.println(num);
                prevNum = num
            }
        }
    }

    public static void task3() {
        int words = 0;
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        System.out.println("Задача 4");
        System.out.println(listRandomString());
        Set<String> uniqueWords = new HashSet<>();
        uniqueWords.addAll(listRandomString());
        System.out.println(uniqueWords);
    }

    private static Collection<String> listRandomString() {
    }


    public static void main(String[] args) {

        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }
}
