class Solution {
    public int trap(int[] height) {
        int premax[]=new int[height.length];
        int sufmax[]=new int[height.length];
        premax[0]=height[0];
        for(int i=1;i<height.length;i++){
            premax[i]=Math.max(premax[i-1],height[i]);
        }
        sufmax[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            sufmax[j]=Math.max(sufmax[j+1],height[j]);
        }
        int ans=0;
        for(int i=1;i<height.length;i++){
            ans+=Math.min(premax[i],sufmax[i])-height[i];
        }
        return ans;
    }
}
