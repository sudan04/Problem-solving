public class UpperBoundProblem {
    public int upperBound(int[] nums, int x) {
        int l = 0, r = nums.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > x) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        UpperBoundProblem obj = new UpperBoundProblem();

        // Test case 1
        int[] nums1 = {1, 3, 5, 7, 9};
        int x1 = 5;
        System.out.println("Upper Bound index: " + obj.upperBound(nums1, x1));  // Expected output: 3 

        // Test case 2
        int[] nums2 = {2, 4, 6, 8, 10};
        int x2 = 8;
        System.out.println("Upper Bound index: " + obj.upperBound(nums2, x2));  // Expected output: 4 

        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        int x3 = 5;
        System.out.println("Upper Bound index: " + obj.upperBound(nums3, x3));  // Expected output: -1 

        // Test case 4
        int[] nums4 = {1, 2, 2, 2, 3, 4};
        int x4 = 2;
        System.out.println("Upper Bound index: " + obj.upperBound(nums4, x4));  // Expected output: 4 
    }
}
