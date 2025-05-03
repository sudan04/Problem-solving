/*
Order-agnostic binary search refers to searching in a sorted array 
where we don't know initially whether it is sorted in ascending or descending order.
*/
public class Order_AgnosticBinarySearch {

    public static void main(String[] args) {
        int[] arr= {-23, -2, 4, 10, 23, 34, 65};
        int target= 23;
        int res= search(arr, target);
        System.out.println(res);

        int[] arr2= {65, 34, 23, 10, 4, -2, -23};
        res=search(arr2, target);
        System.out.println(res);

    }

    public static int search(int[] arr, int target){
        int l=0, r= arr.length-1;

        if(arr[l]<=arr[r]){
            while(l<=r){
                int mid= l+(r-l)/2;

                if(arr[mid]== target) return mid;

                else if(arr[mid]>target) r= mid-1;

                else l= mid+1;
            }
        }else
            while(l<=r){
                int mid= l+(r-l)/2;

                if(arr[mid]== target) return mid;

                else if(arr[mid]>target) l= mid+1;

                else r= mid-1;
            }

        return -1;
    }
}
