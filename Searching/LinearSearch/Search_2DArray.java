
import java.util.Arrays;

public class Search_2DArray {
    public static void main(String[] args) {
        int[][] arr= {
            {2,4,7},
            {8, 30, 5, 9},
            {1,6,44,10}
        };

        int target= 7;
        int [] res= search(arr, target);

        System.out.println("Searching in 2D: "+Arrays.toString(res));

        System.err.println("Max in 2D: "+ findMax(arr));
    }

    // returns the row & column of target element if found else returns [-1,-1]
    public static int[] search(int[][] arr, int target) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }


    // returns max element in 2D array
    public static int findMax(int[][] arr){
        int max= arr[0][0];

        for(int[] a: arr){
            for(int e: a){
                if(e>max) max= e;
            }
        }
        return max;
    }
}
