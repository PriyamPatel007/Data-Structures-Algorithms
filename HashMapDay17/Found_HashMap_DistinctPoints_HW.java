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
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            y[i]=sc.nextInt();
        }
        HashSet<String> hm=new HashSet<>();
        for(int i=0;i<n;i++){
            String val=x[i]+","+y[i];
            hm.add(val);
        }
        System.out.println(hm.size());
    }
}
