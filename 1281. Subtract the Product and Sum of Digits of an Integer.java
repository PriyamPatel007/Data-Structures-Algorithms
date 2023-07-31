class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, multiply=1;
        while(n>0){
               int lastdigit=n%10;
               sum+=lastdigit;
               multiply*=lastdigit;
               n=n/10;
        }
        return multiply-sum;
    }
}
