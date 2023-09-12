//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Character> q=new LinkedList<>(); char ans[]=new char[A.length()];
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            q.add(c);
           
            if(hm.containsKey(c)==true){
                int temp=hm.get(c);
                hm.put(c,temp+1);
            }
            else{
                hm.put(c,1);
            }
            while((q.size()>0) && (hm.get(q.peek())>1)){
                q.remove();
            } 
            if(q.size()>0){
                ans[i]=q.peek();
            }
            else{
                ans[i]='#';
            }
        }
        return String.valueOf(ans);
    }
}
