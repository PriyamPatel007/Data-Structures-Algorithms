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
        int max=arr[0];
        int ind=0;
        int max2=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                ind=i;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        if(max>=2*max2){
            System.out.println(ind);
        }
        else{
            System.out.println(-1);
        }
    }
}
