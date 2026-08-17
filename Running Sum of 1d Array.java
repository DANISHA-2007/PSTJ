class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
OUTPUT:
Accepted
Runtime: 0 ms

Case 1

Case 2

Case 3

Input
nums =
[1,2,3,4]

Output
[1,3,6,10]

Expected
[1,3,6,10]