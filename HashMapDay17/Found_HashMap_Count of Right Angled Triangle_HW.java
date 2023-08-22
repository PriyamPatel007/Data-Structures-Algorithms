import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][2];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(RightAngled(a,n));

    }
    static int RightAngled(int a[][], int n){

    HashMap<Integer, Integer> xpoints = new HashMap<>();
    HashMap<Integer, Integer> ypoints = new HashMap<>();

    for (int i = 0; i < n; i++){
        if(xpoints.containsKey(a[i][0])){
            xpoints.put(a[i][0], xpoints.get(a[i][0]) + 1);
        }else{
            xpoints.put(a[i][0], 1);
            }
        if(ypoints.containsKey(a[i][1])){
             ypoints.put(a[i][1], ypoints.get(a[i][1]) + 1);
        }
        else{
             ypoints.put(a[i][1], 1);
            }
    }

        int count = 0;

        for (int i = 0; i < n; i++){
            if (xpoints.get(a[i][0]) >= 1 &&
                ypoints.get(a[i][1]) >= 1){

                count += (xpoints.get(a[i][0]) - 1) *
                    (ypoints.get(a[i][1]) - 1);
            }
        }

    
        return count;
    }

}
