class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<nums.length;i++){
            end+=nums[i];
            max=Math.max(max,end);
            end=Math.max(end,0);
        }
    
    return max;
    }
}