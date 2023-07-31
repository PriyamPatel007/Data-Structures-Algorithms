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
        int c=0;
        for(long i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    c+=2;
                }
                else{
                    c+=1;
                }
            }
        }
        if(c==2){
            System.out.println("Yay");
        }
        else{
            System.out.println("Nay");
        }
    }
}
