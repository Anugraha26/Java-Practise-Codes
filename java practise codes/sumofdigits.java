import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = scanner.nextLong();
        int result = sumOfDigits(n);
        System.out.println("Sum of digits = " + result);
        scanner.close();
    }
    public static int sumOfDigits(long n) {
        n = Math.abs(n);
        if (n == 0) {
            return 0;
        }
        return (int) (n % 10 + sumOfDigits(n / 10));
    }
}