import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long ans=0;
        int i=0;
        while(i*i<=n){
            ans=i;
            i++;
        }
        System.out.println(ans);
    }
}
