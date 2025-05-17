package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {2,3,4,6,7,32,64,90};

        System.out.println(search(7, arr, 0, arr.length-1));

    }

    public static int search(int target, int[] arr, int left, int right){
        while(left<=right){
            int mid= left+(right-left)/2;
            
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) right= mid-1;
            else left= mid+1;
        }
        
        return -1;
    }
}
