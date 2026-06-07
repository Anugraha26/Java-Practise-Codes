import java.util.ArrayList;
public class RemoveSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,4,2,3,5};
        int n = arr.length;
        int minLength = n;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> list =
                        new ArrayList<>();
                for (int k = 0; k < i; k++) {
                    list.add(arr[k]);
                }
                for (int k = j + 1; k < n; k++) {
                    list.add(arr[k]);
                }
                boolean sorted = true;
                for (int k = 1; k < list.size(); k++) {
                    if (list.get(k) < list.get(k - 1)) {
                        sorted = false;
                        break;
                    }
                }
                if (sorted) {
                    minLength =
                            Math.min(minLength,
                                    j - i + 1);
                }
            }
        }
        System.out.println(
                "Minimum Length = " + minLength);
    }
}