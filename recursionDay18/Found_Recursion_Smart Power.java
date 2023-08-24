import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        long ans=pow(a,n);
        System.out.println(ans);
    }
    public static long pow(int a,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return a;
        }
        long temp=pow(a,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return a*temp*temp;
        }
    }
}
