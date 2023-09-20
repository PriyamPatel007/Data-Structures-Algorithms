import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dp[i][j]=-1;
            }
        }
        int ans=helper(arr,m-1,n-1,dp);
        System.out.println(ans);
    }
    public static int helper(int arr[][],int m,int n,int dp[][]){
        if(m<0 || n<0){
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(arr[m][n]==0){
            return 0;
        }
        int x=helper(arr,m-1,n,dp);
        int y=helper(arr,m,n-1,dp);
        dp[n][m]=x+y;
        return x+y;
    }
}
