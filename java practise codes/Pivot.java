public class Pivot {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int total = 0, left = 0;
        for (int x : arr)
            total += x;
        for (int i = 0; i < arr.length; i++) {
            total = total - arr[i];
            if (left == total) {
                System.out.println("Pivot Index = " + i);
                return;
            }
            left += arr[i];
        }
        System.out.println("-1");
    }
}