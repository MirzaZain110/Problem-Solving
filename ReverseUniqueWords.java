import java.util.LinkedHashSet;

public class ReverseUniqueWords {

    public static String reverseWithoutDuplicates(String input) {
        // Split the input string by spaces to get individual words
        String[] words = input.split(" ");
        
        // LinkedHashSet to store unique words in reverse order
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            uniqueWords.add(words[i]);
        }

        // Join the unique words into a single string
        return String.join(" ", uniqueWords);
    }

    public static void main(String[] args) {
        String input = "hello world hello java world";

        String result = reverseWithoutDuplicates(input);
        System.out.println("Reversed string without duplicates: " + result); 
        // Expected Output: "java hello world"
    }
}
