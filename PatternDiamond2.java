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
        int nst=1;
        int nsp=n/2;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=nst;k++){ 
                System.out.print(count+" ");
                if(k<=nst/2){
                    count++;
                }
                else{
                    count--;
                }
              
            }
            
           
            if(i<=n/2){
                nst+=2;
                nsp--;
                count=i+1;
            }
            else{
                nst-=2;
                nsp++;
                count=n-i;
            }
            System.out.println();
        }
    }
}
