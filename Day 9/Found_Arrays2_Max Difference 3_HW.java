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
        int maxSum=arr[0],ind=0;
        for(int i=0;i<n;i++){
            if((arr[i]-i) > maxSum){
                maxSum=(arr[i]-i);
                ind=i;
            }
        }
        int minSum=arr[0],ind2=0;
        for(int i=0;i<n;i++){
            if(minSum> (arr[i]-i)){
                minSum=(arr[i]-i);
                ind2=i;
            }
        }
        System.out.println(maxSum-minSum);
    }
}
