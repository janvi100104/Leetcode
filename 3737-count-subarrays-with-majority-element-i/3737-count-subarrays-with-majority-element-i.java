class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;

        int[] subArr = new int[n];

        for (int i = 0; i < n; i++) {
            subArr[i] = (nums[i] == target) ? 1 : -1;
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = i; j < n; j++) {

                sum += subArr[j];

                if (sum > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}