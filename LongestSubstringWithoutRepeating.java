import java.util.HashMap;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Start of the current window

        // Iterate over the string with 'end' as the right boundary of the window
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            // If currentChar is in the map and its index is within the current window
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= start) {
                // Move the start to the right of the previous occurrence of currentChar
                start = charMap.get(currentChar) + 1;
            }

            // Update or add the current character's index in the map
            charMap.put(currentChar, end);

            // Calculate the length of the current window and update maxLength if it's larger
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLongestSubstring("zaain"));   // Expected Output: 4
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Expected Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Expected Output: 3
    }
}
