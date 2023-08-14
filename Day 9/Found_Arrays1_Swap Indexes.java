import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();   
        }
        int ind1=sc.nextInt();
        int ind2=sc.nextInt();
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
