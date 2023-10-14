import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        int occ=0;
        for(int i=0;i<n;i++){
            occ=(i+1)*(n-i);
            ans+=(occ*arr[i]);
        }
        System.out.println(ans);
    }
}
