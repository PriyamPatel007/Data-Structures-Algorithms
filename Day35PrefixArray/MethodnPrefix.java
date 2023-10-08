class Solution {
    public int[] runningSum(int[] nums) {
        int prearr[]=new int[nums.length];
        prearr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prearr[i]=prearr[i-1]+nums[i];
        }
    return prearr;
}
}
