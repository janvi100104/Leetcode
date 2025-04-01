class Solution {
    // Function to calculate maximum points using recursion + memoization
    public long solve(int idx, int n, int[][] questions, long[] dp) {
        // Base Case: If index exceeds the number of questions, return 0 (No more questions left)
        if (idx >= n) {
            return 0;
        }

        // If the answer for this index is already computed, return it (Memoization step)
        if (dp[idx] != -1) {
            return dp[idx];
        }

        // **Choice 1: Take the current question**
        // - Add the points from the current question
        // - Move to the next question after skipping `questions[idx][1]` questions
        long take = questions[idx][0] + solve(idx + questions[idx][1] + 1, n, questions, dp);

        // **Choice 2: Skip the current question**
        long notTake = solve(idx + 1, n, questions, dp);

        // Store the maximum result in dp array and return it
        return dp[idx] = Math.max(take, notTake);
    }

    public long mostPoints(int[][] questions) {
        int n = questions.length; // Get total number of questions
        long[] dp = new long[n + 1]; // DP array to store results

        // Initialize DP array with -1 to indicate uncomputed states
        java.util.Arrays.fill(dp, -1);

        return solve(0, n, questions, dp); // Start solving from the first question
    }
}