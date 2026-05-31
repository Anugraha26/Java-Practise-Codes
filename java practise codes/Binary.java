import java.util.Scanner;
import java.util.Arrays;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements (0, 1, or 2):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal Array:");
        printArray(arr);
        binarySortTwoPointer(arr);
        System.out.println("\nSorted Array:");
        printArray(arr);5
        sc.close();
    }
    public static void binarySortTwoPointer(int[] arr) {
        int left = 0;           
        int mid = 0;            
        int right = arr.length - 1;  
        while (mid <= right) {
            if (arr[mid] == 0) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, right);
                right--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}