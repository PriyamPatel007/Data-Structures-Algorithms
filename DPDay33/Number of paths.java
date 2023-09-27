//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    long numberOfPaths(int m, int n) {
        // Code Here
        long dp[][]=new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        long ans=helper(m-1,n-1,dp);
        return ans;
    }
    public static long helper(int m,int n,long dp[][]){
        if(m==0 || n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        long x=helper(m-1,n,dp);
        long y=helper(m,n-1,dp);
        dp[m][n]=x+y;
        return x+y;
    }
    
}
