import java.util.Scanner;
public class Maxisum
 {
    public static void main(String[] args)
     {
        int arr[] = {1, 2, 3, 4, 5};
        int maxSum = Integer.MIN_VALUE;
        for (int start=0; start < arr.length start++)
         {
            for (int end = start; end < arr.length; end++)
            {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                System.out.println("Subarray Sum = " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maxsum="+maxSum);
    }
}