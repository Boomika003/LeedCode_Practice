class Solution {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        long[] leftSum = new long[nums.length];
        long[] rightSum = new long[nums.length];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxHeap.add(nums[i]);
            if (maxHeap.size() > n) sum -= maxHeap.poll();
            leftSum[i] = sum;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            minHeap.add(nums[i]);
            if (minHeap.size() > n) sum -= minHeap.poll();
            rightSum[i] = sum;
        }

        long ans = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            ans = Math.min(ans, leftSum[i] - rightSum[i + 1]);
        }
        return ans;
    }
}