public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        System.out.print("Output: [");
        for (int i = k; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
            if (i != k - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}