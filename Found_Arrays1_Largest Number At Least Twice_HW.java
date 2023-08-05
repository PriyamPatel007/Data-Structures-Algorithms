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
        int maxin=0,secmaxin=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxin=i;
            }
        }
        int sec_max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>sec_max){
                sec_max=arr[i];
                secmaxin=i;
            }
        }
        if(max>=2*sec_max) System.out.println(maxin);
        else System.out.print(-1);
    }
}
