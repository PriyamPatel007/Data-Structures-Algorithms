import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        int n=str.length();
        char ch[]=str.toCharArray();
        char ch1[]=str.toCharArray();
        int s=0;
        int e=n-1;
        while(s<e){
            char temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(ch[i]==ch1[i]){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
