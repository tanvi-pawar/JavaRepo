import java.util.*;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) first = i; // first time we see target
                last = i; // update last whenever we see target
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = max.length();

        System.out.println(Arrays.toString(sol.searchRange(nums, target)));
    }
}
