/*  a Java program that takes a string input from the user,
 splits it into words, and prints the frequency of each unique word */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println("Unique word frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        scanner.close();
    }
}
