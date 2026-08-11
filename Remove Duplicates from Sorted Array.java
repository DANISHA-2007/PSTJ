class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
OUTPUT:
TEST RESULT

Status: Accepted
Runtime: 0 ms

Case 1: Passed
Case 2: Passed

Input:
nums = [1, 1, 2]

Output:
[1, 2]

Expected:
[1, 2]