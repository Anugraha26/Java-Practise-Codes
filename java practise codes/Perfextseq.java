public class Perfextseq {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7};
        int L = 1, R = 3;
        boolean perfect = true;
        int i = L;
        while (i < R) {
            if (arr[i + 1] - arr[i] != 1) {
                perfect = false;
                break;
            }
            i++;
        }
        System.out.println(perfect);
    }
}