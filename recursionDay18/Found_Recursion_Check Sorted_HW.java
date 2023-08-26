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
        boolean bool=bool(arr,n);
        System.out.println(bool);
    }
    public static boolean bool(int arr[],int n){
        if(n<=1){
            return true;
        }
        if(arr[n-1]<arr[n-2]){
            return false;
        }
        return bool(arr,n-1);
    }
}
