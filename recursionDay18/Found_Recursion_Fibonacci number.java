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
        System.out.println(Fibo(n));
    }
    public static int Fibo(int n){
        if((n==1) || (n==0)){
            return n;
        }
        int t1=Fibo(n-1);
        int t2=Fibo(n-2);
        return t1+t2;
    }
}
