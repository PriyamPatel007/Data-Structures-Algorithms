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
        int k=sc.nextInt();
        System.out.println(sum(arr,k));
    }
    public static boolean sum(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i;j<n-1;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
