import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner Sc=new Scanner(System.in);
        String st=Sc.nextLine();
        String ans=Reverse(st);
        System.out.println(ans);
    }
    public static String Reverse(String st){
        char ch[]=st.toCharArray();
        int s=0;
        int n=st.length();
        int e=n-1;
        while(s<e){
            char temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
        String ans=st.valueOf(ch);
        return ans;
    }
}
