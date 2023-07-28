import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int nst=n/2+1;
        int nsp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=nst;l++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println();
        }
    }
}
