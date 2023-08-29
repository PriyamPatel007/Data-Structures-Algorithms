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
        Arrays.sort(arr);
        

        int count=0;
        int lesscount=0;
          if(arr[0] == 0){
            count++;
        }

        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                lesscount=i;
        }
            if(arr[i]==lesscount){
                count++;
            }
        }
        System.out.println(count);
    }
}
