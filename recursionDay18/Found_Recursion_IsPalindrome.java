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
        int s=0;
        int e=st.length()-1;
        char ch[]=st.toCharArray();
        System.out.println(Pal(ch,s,e));
    }
    public static boolean Pal(char ch[],int s,int e){
        if(s>=e){
            return true;
        }
        if((ch[s])==ch[e]){
            
            return Pal(ch,s+1,e-1);
        }
        else{
            return false;
        }
    }
}
