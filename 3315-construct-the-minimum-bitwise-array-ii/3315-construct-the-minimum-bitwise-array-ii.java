class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums.get(i);
            if (num == 2) {
                ans[i] = -1;
            } else {
                boolean found = false;

                for (int bit = 1; bit < 32; bit++) {
                    if ((num & (1 << bit)) > 0) continue;

                    int x = num ^ (1 << (bit - 1));
                    ans[i] = x;
                    found = true;
                    break;
                }

                if (!found) ans[i] = -1;
            }
        }
        return ans;
    }
}