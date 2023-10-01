import java.util.*;


//Time Complexity (TC): O(n)
// Space Complexity (SC): O(1)


public class FindMssingNumberUsingXOR {
    // Function to find the missing number in an array of integers.
    public int missingNumber(int[] nums) {
        int x = 0; // Initialize the variable to store the result.
        int i;     // Declare a loop variable.

        // Loop through the elements of the 'nums' array.
        for (i = 0; i < nums.length; i++) {
            // XOR operation to update 'x' by XORing it with the
            // current element 'nums[i]' and 'i'.
            x = x ^ nums[i] ^ i;
        }

        // After the loop, 'i' will be equal to 'nums.length', which
        // represents the maximum possible value for 'i'. XOR 'x' with 'i'
        // to find the missing number and return it.
        return x ^ i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        int missing = solution.missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
