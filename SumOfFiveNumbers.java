public class SumOfFiveNumbers {

    public static int sum(int[] arr, int index) {
        // Base case: if we've added 5 numbers or reached the end of the array
        if ( index >= arr.length) {
            return 0;
        }

        // Recursive case: add the current element and recurse
        return arr[index] + sum(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // Example array

        // Calling the recursive method to sum the first 5 elements
        int result = sum(arr, 0);

        System.out.println("Sum of numbers: " + result); // Output: 15
    }
}
