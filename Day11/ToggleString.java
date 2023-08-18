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
        char ch[]=new char[n];
        for(int i=0;i<n;i++){
            ch[i]=st.charAt(i);
        }
        toggle(ch);
        for(int i=0;i<n;i++){
            System.out.print(ch[i]);    
        }
    }
    public static void toggle(char ch[]){
        int n=ch.length;
        for(int i=0;i<n;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i]=(char)(ch[i]+32);
            }
            else{
                ch[i]=(char)(ch[i]-32);
            }
        }
    }
}
