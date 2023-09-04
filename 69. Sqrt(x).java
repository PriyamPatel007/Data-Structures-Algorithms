class Solution {
    public int mySqrt(int n) {
        if(n<=1){
            return n;
        }
        int lo=1;
        int hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int square =mid*mid;
            if(square==n){
                return mid;
            }
            else if(square<n){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return hi;
    }
}
