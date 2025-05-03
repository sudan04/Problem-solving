
public class Search_1DArray{
    public static void main(String[] args) {
        int[] arr= {3,4,-3,6,9,20,5};

        // searching element in a array
        int target=6;
        System.out.println("Search: "+search(arr, target));

        // searching element in a array in range(start index- end index)
        int start=2, end=5;
        System.out.println("Searching in range: "+searchInRange(arr, target, start, end));

        // finding minimum in an array
        System.out.println("Minimum: "+ findMin(arr));

        // finding count of numbers which have even number of digits
        int res= findNumbers(new int[]{34, 563, 232, 6432, 62, 12, -676});
        System.out.println("Numbers with even digits: "+ res);

    }

    // returns index of the target element if found otherwise returns -1
    public static int search(int[] arr, int target) {
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



    // find count of the numbers that have even numbers of digits
    public static int findNumbers(int[] nums) {
        int count=0;

        for(int a: nums){
            if(checkEven(countDigits(a)))
                count++;
        }

        return count;
    }

    // to check if number of digits are even
    public static boolean checkEven(int num){
        return num%2 == 0;
    }

    // method to count number of digits in a number
    public static int countDigits(int num){
        if(num < 0) num*= -1;
        if(num==0) return 1;
        
        int digits= 0;
        while(num>0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}