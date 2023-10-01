public class LongestSubarraySum {
    public static void main(String[] args) {
        int arr[] = {1, 4, -7, 3, -2, 3};
        longestSubarraySum(arr);
    }

    private static void longestSubarraySum(int[] arr) {
        int n = arr.length;
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > maxEndingHere + arr[i]) {
                maxEndingHere = arr[i];
                tempStart = i;
            } else {
                maxEndingHere += arr[i];
            }

            if (maxEndingHere > maxSoFar) {
                maxSoFar = maxEndingHere;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("The longest subarray with the maximum sum is:");
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
        System.out.println("Maximum sum: " + maxSoFar);
    }
}
