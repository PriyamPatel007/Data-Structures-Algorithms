import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek()==s.charAt(i)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        char ch[]=new char[st.size()];
        for(int i=ch.length-1;i>=0;i--){
            ch[i]=st.pop();
        }
        String ans=s.valueOf(ch);
        System.out.println(ans);
        }
}
