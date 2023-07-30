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
        int r=sc.nextInt();
        int nfact=fact(n);
        int rfact=fact(r);
        int nmrfact=fact(n-r);
        int ans2=nfact/nmrfact;
        int ans3=nfact/(rfact*nmrfact);
        System.out.println(nfact);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
}
