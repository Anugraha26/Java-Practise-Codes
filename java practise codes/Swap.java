public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 1;
        int j = 3;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.print("Output: [");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
            if (k != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}