
public class Search_1DArray{
    public static void main(String[] args) {
        int[] arr= {3,4,-3,6,9,20,5};
        int target=6;
        System.out.println("Search: "+search(arr, target));

        int start=2, end=5;
        System.out.println("Searching in range: "+searchInRange(arr, target, start, end));

        System.out.println("Minimum: "+ findMin(arr));
    }

    // returns index of the target element if found otherwise returns -1
    private static int search(int[] arr, int target) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i; 
            }
        }
        return -1;
    }


    // search target element in range of indexes
    public static int searchInRange(int[] arr, int target, int start, int end){
        for(int i=start; i<= end; i++){
            if(target== arr[i]) return i;
        }
        return -1;
    }


    // return minimum element int the array
    public static int findMin(int[] arr){
        int min= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]< min)
                min= arr[i];
        }
        return min;
    }
}