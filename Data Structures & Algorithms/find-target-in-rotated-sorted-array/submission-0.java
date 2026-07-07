class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Target found
            if (nums[mid] == target) {
                return mid;
            }
            // LEFT HALF IS SORTED
            if (nums[start] <= nums[mid]) {
               // Target is inside left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                }
                // Target is not inside left half
                else {
                    start = mid + 1;
                }
            }
            // RIGHT HALF IS SORTED
            else {
                // Target is inside right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                // Target is not inside right half
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}