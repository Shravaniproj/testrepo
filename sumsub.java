import java.util.*;

public class sumsub {

    public static void printSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                
                System.out.print(currSum + " ");
                
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        
        System.out.println("\nMaximum Subarray Sum: " + maxSum);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        printSum(arr);
    }
}
