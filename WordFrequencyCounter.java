import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Create a Set to store unique words
        try (Scanner scanner = new Scanner(System.in)) {
            // Create a Set to store unique words
            Set<String> uniqueWords = new HashSet<>();
            // Create a Map to store word frequencies
            Map<String, Integer> wordFrequencies = new HashMap<>();
            // Read a line of text from the user
            System.out.println("Enter a line of text:");
            String line = scanner.nextLine();
            // Split the line into words
            String[] words = line.split("\\s+");
            // Process each word
            for (String word : words) {
                // Convert word to lowercase to ensure case-insensitivity
                word = word.toLowerCase();
                
                // Add word to the set of unique words
                uniqueWords.add(word);
                
                // Update the word frequency in the map
                if (wordFrequencies.containsKey(word)) {
                    wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                } else {
                    wordFrequencies.put(word, 1);
                }
            }   // Display unique words
            System.out.println("Unique words:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }   // Display word frequencies
            System.out.println("\nWord frequencies:");
            for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            // Close the scanner
        }
    }
}
