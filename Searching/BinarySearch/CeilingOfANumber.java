/*
Ceiling of a number => Given an array and a target element,
we have to return the value that is equal to the target or the smallest
element that is greater than the target.
*/
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr= {2,4,8,43,56,345,675};

        int res= findCeiling(arr, 66);
        System.out.println(res);
    }

    public static int findCeiling(int[] arr, int target){
        int ans=-1, l=0, r= arr.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]== target) return arr[mid];
            if(arr[mid]>target){
                ans= arr[mid];
                r=mid-1;
            }else
                l= mid+1;
        }
        return ans;
    }
}
