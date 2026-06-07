public class LongestOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int left = 0;
        int zeros = 0;
        int maxLength = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (arr[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println("Longest Length = " + maxLength);
    }
}