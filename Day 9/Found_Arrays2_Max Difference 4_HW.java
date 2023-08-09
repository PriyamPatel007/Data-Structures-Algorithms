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
        int cs=0;
        int indDiff=0;
        int MaxDiff=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                cs=Math.abs(arr[i]-arr[j]);
                indDiff=cs+Math.abs(i-j);
                MaxDiff=Math.max(MaxDiff,indDiff);
    }
} 
        System.out.println(MaxDiff);
    }
}
