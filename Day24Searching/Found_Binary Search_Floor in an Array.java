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
        System.out.println(Check(arr,k));
    }
    public static int Check(int arr[],int k){
        int lo=0;
        int hi=arr.length-1;
        int ans=Integer.MIN_VALUE;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==k){
                return ans;
            }
            else if(arr[mid]<k){
                ans=arr[mid];
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
