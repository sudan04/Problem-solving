package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 5, 3, 1, 9, 4};
        
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        // Calling the sorting method to sort the array in ascending order
        sortArrAsc(arr);

        // Displaying the array after sorting
        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to sort the array in ascending order using the Selection Sort algorithm
    public static void sortArrAsc(int[] arr) {
        int n = arr.length;  
        
        // Outer loop: Iterate over the entire array
        for(int i = 0; i < n - 1; i++) {
            // Assume the current element (at index i) is the smallest
            int smallest = i;
            
            // Inner loop: Find the smallest element in the unsorted part of the array
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;  
                }
            }

            // If the smallest element is not already in the correct position, swap it
            if(arr[smallest] < arr[i]) {
                int temp = arr[i];      
                arr[i] = arr[smallest];  
                arr[smallest] = temp;   
            }
        }
    }
}
