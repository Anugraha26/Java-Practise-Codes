import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        Calculator c = new Calculator();
        c.sum(a, b);
        c.diff(a, b);
        c.mul(a, b);
        c.mod(a, b);
    }
}
class Calculator {
    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }
    void diff(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }
    void mul(int a, int b) {
        System.out.println("Multiplication = " + (a * b));
    }
    void mod(int a, int b) {
        System.out.println("Modulus = " + (a % b));
    }
}