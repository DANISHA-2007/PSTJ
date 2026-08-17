class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }
}

OUTPUT:
Accepted
Runtime: 0 ms

Case 1

Case 2

Input
nums =
[-4,-1,0,3,10]

Output
[0,1,9,16,100]

Expected
[0,1,9,16,100]