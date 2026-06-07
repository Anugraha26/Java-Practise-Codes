public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[^a-zA-Z0-9]", "")
             .toLowerCase();
        String reverse =
                new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reverse));
    }
}