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
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int ans=Func(arr,n);
        System.out.println(ans);
    }
    public static int Func(int arr[][],int n){
        HashMap<Integer,Integer> x=new HashMap<>();
        HashMap<Integer,Integer> y=new HashMap<>();
        for(int i=0;i<n;i++){
            if(x.containsKey(arr[i][0])){
                x.put(arr[i][0],x.get((arr[i][0])+1));
            }
            else{
                x.put(arr[i][0],1);
            }
            if(y.containsKey(arr[i][1])){
                y.put(arr[i][1],y.get((arr[i][1])+1));
            }
            else{
                y.put(arr[i][1],1);
            }
               }
        int count =0;
        for(int i=0;i<n;i++){
            int countx=x.get(arr[i][0]);
            int county=y.get(arr[i][1]);
            count+=((countx-1)*(county-1));
        }
        return count;
    }
}
