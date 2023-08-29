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
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int ans=Check(arr,0,m);
        System.out.println(ans);
    }
    public static int Check(int arr[],int n,int m){
        if(n==arr.length){ return -1;
        }
        else if(arr[n]==m){ 
            return n;
        }
        else{
            return Check(arr,n+1,m);
        }
    }
}
