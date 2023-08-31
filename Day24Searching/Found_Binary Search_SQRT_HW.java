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
        int ans=Check(n);
        System.out.println(ans);
    }
    public static int Check(int n){
        if(n<=1){
            return n;
        }
        int lo=1;
        int hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int square =mid*mid;
            if(square==n){
                return mid;
            }
            else if(square<n){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return hi;
    }
}
