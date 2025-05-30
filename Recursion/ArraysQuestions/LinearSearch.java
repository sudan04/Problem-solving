package Recursion.ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {3,4,6,2,78,56,324,23,6,34,6};

        // System.out.println(find(arr, 56, 0));
        System.out.println(findNums(arr,6 , 0, new ArrayList<>()));
    }

    static int find(int[] arr, int target, int l){
        if(l==arr.length) return -1;

        if(arr[l]== target) return l;

        return find(arr, target, l+1);
    }



    // multiple occurrence search: return a List
    static List<Integer> findNums(int arr[], int target, int l, List<Integer> list){
        if(l==arr.length) return list;

        if(target== arr[l]){
            list.add(l);
            return findNums(arr, target, l+1, list);
        }

        return findNums(arr, target, l+1, list);
    }
}
