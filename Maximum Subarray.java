class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maximum = Math.max(maximum, current);
        }

        return maximum;
    }
}
OUTPUT:
TEST RESULT

Status: Accepted
Runtime: 0 ms

Case 1: Passed
Case 2: Passed
Case 3: Passed

Input:
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Output:
6

Expected:
6