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
        int ans1=countover(st,0);
        int ans2=countnoover(st,0);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    public static int countover(String st,int idx){
        if(idx>=st.length()-2){
            return 0;
        }
        int temp=countover(st,idx+1);
        if((st.charAt(idx)=='a') && (st.charAt(idx+1)=='a') && (st.charAt(idx+2)=='a')){
            return temp+1;
        }
        else{
            return temp;
        }
    }
        public static int countnoover(String st,int idx){
        if(idx>=st.length()-2){
            return 0;
        }
        if((st.charAt(idx)=='a') && (st.charAt(idx+1)=='a') && (st.charAt(idx+2)=='a')){
            int temp=countnoover(st,idx+3);
            return temp+1;
        }
        else{
            int temp=countnoover(st,idx+1);
            return temp;
        }
    }
}
