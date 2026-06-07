public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) {
                count--;
            }
            if (isVowel(s.charAt(i))) {
                count++;
            }
            max = Math.max(max, count);
        }
        System.out.println("Maximum Vowels = " + max);
    }
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}