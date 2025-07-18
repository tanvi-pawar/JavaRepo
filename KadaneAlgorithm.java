class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum = currentSum + nums[i];
            }

            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 5, -2, 7, -4};
        int[] nums2 = {-2, -3, -7, -2, -10, -4};

        System.out.println(maxSubArray(nums1)); // Output: 15
        System.out.println(maxSubArray(nums2)); // Output: -2
    }
}
