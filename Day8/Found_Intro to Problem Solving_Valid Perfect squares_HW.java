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
        int ans=1;
        int i=1;
        while(i*i<=n){
            ans=i;
            i++;
        }
        if(ans*ans==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
