class Solution {
    public int fib(int n) {
        if((n==0) || (n==1)){
            return n;
        }
        int t=fib(n-2);
        int t1=fib(n-1);
        return t+t1;
}
}
