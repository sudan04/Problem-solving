package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int arr[]={2,5,8,5,3,1,9,4};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        sortArrAsc(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArrAsc(int[] arr) {
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int smallest= i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[smallest])
                    smallest= j;
            }
            if(arr[smallest]<arr[i]){
                int temp= arr[i];
                arr[i]= arr[smallest];
                arr[smallest]= temp;
            }
            
        }
    }
}
