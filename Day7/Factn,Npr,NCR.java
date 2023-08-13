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
        System.out.println(nfact);
        int ans1=nfact/nmrfact;
        int ans2=nfact/(rfact*nmrfact);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
