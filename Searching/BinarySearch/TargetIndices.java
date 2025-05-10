import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {
    public static void main(String[] args) {
        int[] arr= {2,5,2,3,3,6,2,9};

        List<Integer> ans= targetIndices(arr, 2);
        System.out.println(ans);
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans= new ArrayList<>();

        int lowerBound= bound(nums, target, true);
        int upperBound= bound(nums, target, false);

        while(lowerBound<= upperBound){
            ans.add(lowerBound++);
        }
        return ans;
    }

    public static int bound(int[] arr, int target, boolean isLower){
        int l=0, r=arr.length-1;
        int ans=-1;

        while(l<=r){
            int mid= l+(r-l)/2;

            if(arr[mid]==target){
                ans= mid;
                if(isLower)
                    r= mid-1;
                else
                    l=mid+1;
            }else if(arr[mid]>target)
                r= mid-1;
            else
             l= mid+1;
        }
        return ans;
    }
}