class NumArray {
int prearr[];
    public NumArray(int[] nums) {
        prearr=new int[nums.length];
        prearr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prearr[i]=prearr[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prearr[right];
        }
        return prearr[right]-prearr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
