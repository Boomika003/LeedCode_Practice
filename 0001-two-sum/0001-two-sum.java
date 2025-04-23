class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> num=new HashMap<>();
      int n=nums.length;
      for(int i=0;i<n;i++){
        num.put(nums[i],i);
      }
      for(int i=0;i<n;i++){
        int com=target-nums[i];
        if(num.containsKey(com) && num.get(com)!=i){
            return new int[]{num.get(com),i};
        }
      }
      return new int[]{};
    }
}