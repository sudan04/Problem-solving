package Recursion.ArraysQuestions;

import java.util.Arrays;

public class MergeSort {
    static void sort(int arr[], int l, int r){
        if(l<r){
            int mid= l+(r-l)/2;
            sort(arr,l,mid);
            sort(arr, mid+1, r);

            merge(arr, l, mid, r);
        }
    }

    static void merge(int arr[], int l, int mid, int r){
        int n1= mid-l+1;
        int n2= r-mid;

        int[] leftArr= new int[n1];
        int[] rightArr= new int[n2];

        for(int i=0; i<n1; i++){
            leftArr[i]= arr[l+i];
        }
        for(int i=0; i<n2; i++){
            rightArr[i]= arr[mid+i+1];
        }


        int i=0, j=0;
        int k= l;
        while(i<n1 && j<n2){
            if(leftArr[i]<= rightArr[j]){
                arr[k++]= leftArr[i++];
            }else{
                arr[k++]= rightArr[j++];
            }
        }


        while(i<n1){
            arr[k++]= leftArr[i++];
        }

        while(j<n2){
            arr[k++]= rightArr[j++];
        }
    }
    public static void main(String[] args) {
        int arr[]= {78,45,23,55,67,4,3,68,12};

        System.out.println("Before sorting:\n"+Arrays.toString(arr));
        sort(arr, 0, arr.length-1);
        System.out.println("After sorting:\n"+Arrays.toString(arr));
    }
}
