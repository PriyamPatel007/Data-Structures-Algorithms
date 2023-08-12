import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int n=st.length();
        String s="";
        int diff=0;
        for(int i=0;i<n-1;i++){
            s+=st.charAt(i);
            diff= st.charAt(i + 1) - st.charAt(i);
            s+=diff;
        }
        s+=st.charAt(st.length()-1);
        System.out.println(s);
    }
}
