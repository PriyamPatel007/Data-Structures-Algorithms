import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Queue<String> q=new LinkedList<>();
        q.add("1");
        q.add("2");
        String ans="";
        for(int i=1;i<=k;i++){
            String temp=q.remove();
            ans=temp;
            q.add(temp+"1");
            q.add(temp+"2");
        }
        System.out.println(ans);
    }
}
