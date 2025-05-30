package Recursion.ArraysQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {3,4,6,2,78,56,324,23};

        System.out.println(find(arr, 56, 0));
    }

    static int find(int[] arr, int target, int l){
        if(l==arr.length) return -1;

        if(arr[l]== target) return l;

        return find(arr, target, l+1);
    }
}
