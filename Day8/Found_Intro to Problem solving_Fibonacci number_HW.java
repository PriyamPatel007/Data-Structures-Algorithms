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
        if(n==0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(1);
        }
        else{
            int a=0,b=1,c=0;
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}
