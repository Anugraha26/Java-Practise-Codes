public class Prefix {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int i = 0, sum = 0;
        while (i < n) {
            sum += arr[i];
            pre[i] = sum;
            i++;
        }
        i = n - 1;
        sum = 0;
        while (i >= 0) {
            sum += arr[i];
            suf[i] = sum;
            i--;
        }
        System.out.print("Prefix: ");
        i = 0;
        while (i < n)
            System.out.print(pre[i++] + " ");
        System.out.print("\nSuffix: ");
        i = 0;
        while (i < n)
            System.out.print(suf[i++] + " ");
    }
}