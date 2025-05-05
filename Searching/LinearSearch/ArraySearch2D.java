
import java.util.Arrays;


public class ArraySearch2D {

    public static void main(String[] args) {
        int[][] arr = {
            {2, 3, 7, 8},
            {44, 45, 89},
            {90, 122, 234}};
        int target = 122;
        int res[] = search(arr, target);

        System.out.println(Arrays.toString(res));

    }

    public static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==target){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
    }

}


