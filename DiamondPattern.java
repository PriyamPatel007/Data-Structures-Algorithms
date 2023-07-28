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
        int nst=1,nsp=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst+=2;
                nsp--;
            }
            else{
                nst-=2;
                nsp++;
            }
            System.out.println();
        }
    }
}
