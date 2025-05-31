package Recursion.ArraysQuestions;

public class SearchInRotated {
    public static void main(String[] args) {
        int arr[]= {7,8,13,2,4,5,6};

        int ans= searchInRotatedSortedArr(arr, 5, 0, arr.length-1);
        System.out.println(ans);
    }

    static int searchInRotatedSortedArr(int[] arr, int target, int l, int r){
        if(l>r) return -1;

        int mid= l+(r-l)/2;
        if(arr[mid]== target) return mid;
        if(arr[l]<=arr[mid]){
            if(target>=arr[l] && target<=arr[mid])
            {
                return searchInRotatedSortedArr(arr, target, l, mid-1);
            }else
                return  searchInRotatedSortedArr(arr, target, mid+1, r);
        }
        if(target>=arr[mid] && target<=arr[r])
            return searchInRotatedSortedArr(arr, target, mid+1, r);

        return searchInRotatedSortedArr(arr, target, l, mid-1);
    }   
}
