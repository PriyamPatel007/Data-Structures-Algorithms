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
        boolean bool=Check(arr,k);
        System.out.println(bool);
    }
    public static boolean Check(int arr[],int k){
        
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==k){
                return true;
            }
            else if(arr[mid]<k){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}
