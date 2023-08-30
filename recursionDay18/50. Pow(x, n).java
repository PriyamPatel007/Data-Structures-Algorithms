class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        long n1=n;
        if(n1<0){
            n1=n1*(-1);
        }
        double ans=Check(x,n1);
        if(n<0){
            return 1/ans;
        }
        else{
            return ans;
        }
    }
    public static double Check(double x,long n){
        if(n==1){
            return x;
        }
        double temp=Check(x,n/2);
        if(n%2==0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
    }
    }
