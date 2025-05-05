
import java.util.Arrays;

public class FirstAndLastIndexOfTarget {

    public static void main(String[] args) {
        int arr[] = {4,6,7,7,43,48,60};

        int target = 48;
        int res[];
        // res= searchh(arr, target);
        // System.out.println(Arrays.toString(res));

        res= findFirstAndLastIndex(arr,target);
        System.out.println(Arrays.toString(res));

        // System.out.println(Arrays.toString(searchh(new int[]{23, 35, 64, 232, 567, 2, 64}, 64)));
    }




    // returns first and last index of the target element if found otherwise
    // returns [-1,-1] using binary search
    public static int[] findFirstAndLastIndex(int[] arr, int target) {
        int first, last;
        first= search(arr, target, true);
        last= search(arr, target, false);

        return new int[]{first,last};
    }

    // this method search for the index of target for firstIndex or the lastIndex
    public static int search(int[] nums, int x, boolean firstIndex) {
        int l = 0, r =nums.length-1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == x) {
                ans = mid;
                /*if firstIndex is true we are finding firstIndex 
                of the target and moving towards the start of the array
                otherwise we will find the last index while moving towards the end of the array
                */
                if(firstIndex) 
                    r = mid - 1;
                else
                    l=mid+1;
            } else if (nums[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }




    


    //brute force: without using binary search in sorted array
    public static int[] searchh(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int first = -1, last = -1;

        while (l < arr.length) {
            if (arr[l] == target) {
                last = l;
            }
            if (arr[r] == target) {
                first = r;
            }

            l++;
            r--;
        }
        return new int[]{first, last};
    }









    // brute force: in unsorted array
    public static int[] searchhh(int[] arr, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i; // assign only when first time target appears

                                }last = i; // update every time when target match with array element
            }
        }
        return new int[]{first, last};
    }
}
