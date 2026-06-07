public class SmallestSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int S = 7;
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        System.out.println("Smallest Length = " + minLength);
    }
}