package Recursion.ArraysQuestions;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,34,56,33};

        System.out.println(sortedArray(arr, 0));
    }

    static boolean sortedArray(int[] arr, int l){
        if(l== arr.length-1) return true;
        if(arr[l]>arr[l+1]) return false;
        
        return sortedArray(arr, l+1);
    }
}
