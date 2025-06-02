package Recursion.ArraysQuestions;

import java.util.Arrays;

// In-place Merge Sort: merges two sorted halves of an array without using extra space
public class InPlaceMergeSort {

    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;

            // Recursively sort the left and right halves
            sort(arr, l, mid);
            sort(arr, mid + 1, r);

            // Merge the sorted halves in-place
            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {
        int start1 = l;
        int start2 = m + 1;

        // If already in order, no merge needed
        if (arr[m] <= arr[start2]) {
            return;
        }

        // Merge the two sorted parts in-place
        while (start1 <= m && start2 <= r) {
            if (arr[start1] <= arr[start2]) {
                start1++;
            } else {
                // Store arr[start2] and shift all elements between start1 and start2 to the right
                int value = arr[start2];
                int index = start2;

                while (index != start1) {
                    arr[index] = arr[index - 1];
                    index--;
                }

                arr[start1] = value;

                start1++;
                start2++;
                m++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {78, 45, 23, 55, 67, 4, 3, 68, 12};

        System.out.println("Before sorting:\n" + Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting:\n" + Arrays.toString(arr));
    }
}
