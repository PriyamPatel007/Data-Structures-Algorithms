import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,rem=0,rev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}
