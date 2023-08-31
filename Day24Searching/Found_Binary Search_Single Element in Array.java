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
        int ans=Single(arr);
        System.out.println(ans);
    }
    public static int Single(int arr[]){
        int n=arr.length;
        int lo=2;
        int hi=n-3;
        while(lo<=hi){
            if(arr[0]!=arr[1]){
                return arr[0];
            }
            if(arr[n-1]!=arr[n-2]){
                return arr[n-1];
            }
            int mid=(lo+hi)/2;
            if((arr[mid]!=arr[mid-1]) && (arr[mid]!=arr[mid+1])){
                return arr[mid];
            }
               if(arr[mid]==arr[mid-1]){
                   mid--;
        }  
               if(mid%2==0){
                   lo=mid+2;
               }
               else{
                   hi=mid-1;
               }
}               
               return -1;
               }
               }
