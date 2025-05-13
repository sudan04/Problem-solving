package Sorting;
import java.util.Arrays;

public class BubbleSort {
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

    // Method to sort the array in ascending order using the Bubble Sort algorithm
    public static void sortArrAsc(int[] arr) {
        int n = arr.length;  // Get the length of the array
        
        // Outer loop: Repeat the sorting process for each element except the last one
        for(int i = 0; i < n - 1; i++) {

            /*this flag is used to check if the array elements are swaped, if there is no swap occured during 
            first inner loop iterations the array is alredy sorted, so we can just terminate the method  */
           boolean isSwaped= false; 
            // Inner loop: Compare adjacent elements and swap if needed
            for(int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next one, swap them
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];       
                    arr[j] = arr[j + 1];     
                    arr[j + 1] = temp;   
                    isSwaped= true;   
                }
            }
             if(!isSwaped) return;
        }
    }
}
