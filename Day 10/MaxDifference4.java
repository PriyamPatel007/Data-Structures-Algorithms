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
        int ans1=MaxDifference(arr);
        int ans2=MaxDifference2(arr);
        System.out.println(Math.max(ans1,ans2));
    }
    public static int MaxDifference(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+i;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]-i;
        }
        return max-min;
    }
    public static int MaxDifference2(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]-i;
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]+i;
        }
        return max-min;
    }
}
