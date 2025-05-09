public class SearchInRotatedSortedArrayII {

    // Function to search target in rotated sorted array with duplicates
    public boolean search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            // If the mid element is the target, return true
            if (nums[mid] == target) return true;

            // If we have duplicates at l, mid, and r
            else if (nums[mid] == nums[l] && nums[mid] == nums[r]) {
                l++;
                r--;
            }
            // Left half is sorted
            else if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            }
            // Right half is sorted
            else {
                if (target <= nums[r] && target > nums[mid])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }

        // Target not found
        return false;
    }

    // Main method to run test cases
    public static void main(String[] args) {
        SearchInRotatedSortedArrayII solution = new SearchInRotatedSortedArrayII();

        // Test Case 1
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println("Test Case 1: " + solution.search(nums1, target1)); // true

        // Test Case 2
        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println("Test Case 2: " + solution.search(nums2, target2)); // false

        // Test Case 3
        int[] nums3 = {1, 0, 1, 1, 1};
        int target3 = 0;
        System.out.println("Test Case 3: " + solution.search(nums3, target3)); // true

        // Test Case 4
        int[] nums4 = {1, 1, 1, 1, 1};
        int target4 = 2;
        System.out.println("Test Case 4: " + solution.search(nums4, target4)); // false
    }
}
