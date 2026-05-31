public class Freqarray 
{
    public static void main(String[] args)
     {
        int[] arr = {1,1, 2, 2, 3, 3, 4};
        int n = arr.length;
        int[] freq = new int[n];
        for (int i = 0; i < n; i++) 
        {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) 
        {
            if (freq[i] > 0)
            {
                System.out.println(i + ": " + freq[i]);
            }
        }
    }
}