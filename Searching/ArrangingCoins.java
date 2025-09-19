class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n; // use long to avoid overflow
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;
            
            if (sum == n) return (int) mid;
            if (sum < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) right; // right will be the largest k such that sum <= n
    }
}
