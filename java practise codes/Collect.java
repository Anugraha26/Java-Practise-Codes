import java.util.Collections;
import java.util.*;
public class Collect {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        for (int i : list) {
            System.out.println(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}