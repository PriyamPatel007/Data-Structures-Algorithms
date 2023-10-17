class Solution {
    public int maxProduct(int[] nums) {
        int pfp=1;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(pfp==0){
                pfp=nums[i];
            }
            else{
                pfp*=nums[i];
            }
            max=Math.max(max,pfp);
        }
        int sfp=1;
        int max2=Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(sfp==0){
                sfp=nums[i];
            }
            else{
                sfp*=nums[i];
            }
            max2=Math.max(max2,sfp);
        }
        return Math.max(max,max2);
    }
}
