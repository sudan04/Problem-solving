

/*
    This solution is for finding the index of an element in an infinite array.
    Here, creating an infinite array is not possible, so we will assume that 
    the array is infinite and will never use arr.length property.

    The approach to solve this problem is:
    We will have two pointers l -> left and r -> right.
    Initially, l is at 0 and r is at 1. We will check if the target element
    lies between these two pointers. If yes, we will search for the target 
    between l and r using binary search. Otherwise, we will double the range 
    and shift r towards the right.

    ⚠️ Note:
    This solution assumes the array is infinite.
    If we run this on a normal fixed-size array (like in Java),
    and if the target is larger than all elements in the array, 
    or the r pointer keeps expanding beyond the array size, 
    this will throw ArrayIndexOutOfBoundsException.

    ➡️ So, this solution will NOT work if:
       - The array is finite (like normal arrays in Java)
       - And the target is greater than the maximum element in the array 
         which causes 'r' to go beyond the valid index range.
*/

public class searchPosition_In_InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                     11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                     22, 34, 36, 37, 39, 40, 47, 48, 50, 56,
                     59, 60, 65, 89}; 

        int res = search(arr, 65);  // ✅ Works
        System.out.println(res);

        // int res2 = search(arr, 1000);  // ✅ Safe, returns -1
        // System.out.println(res2);
    }

    public static int search(int[] arr, int target) {
        int l = 0, r = 1;

        // Expand range until target <= arr[r] or r goes out-of-bounds
        while (true) {
            try {
                if (arr[r] >= target) {
                    break;
                }
                int gap = (r - l + 1) * 2;
                l = r + 1;
                r = r + gap;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Stop expanding, but don't use arr.length
                // Just set r to last safe index (we don't know arr.length)
                break;
            }
        }

        // Binary search between l and r
        while (l <= r) {
            int mid = l + (r - l) / 2;

            try {
                if (arr[mid] == target) return mid;
                else if (arr[mid] < target) l = mid + 1;
                else r = mid - 1;
            } catch (ArrayIndexOutOfBoundsException e) {
                // If mid is out of bounds, reduce r
                r = mid - 1;
            }
        }

        return -1;
    }
}
