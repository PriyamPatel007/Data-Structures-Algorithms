class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int lo=2;
        int hi=n-3;
        if(nums.length == 1){
            return nums[0];
        }
  if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length - 2]){
            return nums[nums.length-1];
        }

        while(lo<=hi){
            if(nums[0]!=nums[1]){
                return nums[0];
            }
            if(nums[n-1]!=nums[n-2]){
                return nums[n-1];
            }
            int mid=lo + (hi-lo)/2;
            if((nums[mid]!=nums[mid-1]) && (nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
               if(nums[mid]==nums[mid-1]){
                   mid--;
        }  
               if(mid%2==0){
                   lo=mid+2;
               }
               else{
                   hi=mid-1;
               }
}               
               return -1;
               }
               }
