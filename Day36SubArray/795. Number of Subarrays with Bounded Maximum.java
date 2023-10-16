class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int prevValid=0;
        int lgei=0;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>right){
                ans+=0;
                lgei=i+1;
                prevValid=0;
            }
            else if(nums[i]>=left && nums[i]<=right){
                ans+=(i-lgei+1);
                prevValid=i-lgei+1;
            }
            else{
                ans+=prevValid;
            }
        }
        return ans;
    }
}
