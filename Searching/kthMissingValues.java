class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Numbers missing until arr[mid]
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // The kth missing number is k + left
        return left + k;
    }
}
