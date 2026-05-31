public class Arraytraverse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 9};
        System.out.print("Left to Right: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Right  to Left: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}