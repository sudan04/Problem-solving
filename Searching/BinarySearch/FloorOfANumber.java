public class FloorOfANumber{
    public static void main(String[] args) {
        int[] arr= {2,4,8,43,56,345,675};

        int res= findFloor(arr, 1);
        System.out.println(res);
    }

    public static int findFloor(int arr[], int target){
        int ans=-1, l=0, r= arr.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]== target) return arr[mid];
            if(arr[mid]<target){
                ans= arr[mid];
                l= mid+1;
                
            }else
                r=mid-1;
        }
        return ans;
    }
}