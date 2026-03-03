import java.util.*;

public class PrefixSumBruteforce {

    public static void Print_PrefixSum(int numbers[]) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        // Step 1: Create prefix array
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        // Step 2: Find maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;

                if (start == 0) {
                    currsum = prefix[end];
                } else {
                    currsum = prefix[end] - prefix[start - 1];
                }

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Max Sum = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 6, -1, 3};
        Print_PrefixSum(numbers);
    }
}


// Output:

// Max Sum = 8