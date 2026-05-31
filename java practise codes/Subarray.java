import java.util.Scanner;
public class Subarray {
    public static void main(String[]args)
    {
        int arr[]={1,2,3,4,5};
        for(int start =0;start<arr.length-1;start++)
        {
            for(int end=0;start<arr.length-1;start++)
            {
                for(int end=0;end<arr.length-1;end++)
                {
                    for(int k=start ;k<=end;k++){
                        System.out.print(arr[k]+" ");
                    }
                }
            }System.out.println();
        }
    }