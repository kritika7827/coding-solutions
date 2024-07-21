class MaxAvgSubArrI {
    public double findMaxAverage(int[] nums, int k) {
        
        //sliding window concept
        //tc - O(n) , SC - O(1)

        double maxSum = 0.0;
        int sum =0;

        for (int i=0;i<k;i++){
            sum+= nums[i];
        }

        maxSum = sum;

        for(int i=k;i< nums.length;i++){
            sum+= nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum/k;
    }
}
