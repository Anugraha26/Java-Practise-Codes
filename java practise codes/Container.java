import java.util.Scanner;
public class Container {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int left = 0, right = n - 1, max = 0;
        while (left < right) {
            int area = (right - left) * Math.min(h[left], h[right]);
            max = Math.max(max, area);
            if (h[left] < h[right])
                left++;
            else
                right--;
        }
        System.out.println(max);
    }
}