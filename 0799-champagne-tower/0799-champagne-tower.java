class Solution {

    double[][] dp = new double[101][101];

    public double solve(int poured, int query_row, int query_glass) {

        if (query_row < 0 || query_glass < 0 || query_glass > query_row) {
            return 0.0;
        }

        if (query_row == 0 && query_glass == 0) {
            return poured;
        }

        // If already computed
        if (dp[query_row][query_glass] != -1) {
            return dp[query_row][query_glass];
        }

        double left_up =
            (solve(poured, query_row - 1, query_glass - 1) - 1) / 2.0;
        double right_up =
            (solve(poured, query_row - 1, query_glass) - 1) / 2.0;

        if (left_up < 0) left_up = 0;
        if (right_up < 0) right_up = 0;

        dp[query_row][query_glass] = left_up + right_up;
        return dp[query_row][query_glass];
    }

    public double champagneTower(int poured, int query_row, int query_glass) {

        // initialize dp with -1
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = -1;
            }
        }

        return Math.min(1.0, solve(poured, query_row, query_glass));
    }
}