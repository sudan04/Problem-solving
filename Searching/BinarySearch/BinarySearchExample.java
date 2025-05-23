
public class BinarySearchExample {
    public static void main(String[] args) {
    
        int[] arr= {-42,5,23,29,34,67,89};
  
        int target= 67;
        int res= binarySearch(arr, target);
  
        System.out.println(res);
    }
  
    public static int binarySearch(int[] arr, int target) {
      int l=0, r= arr.length-1;
  
      while(l<=r){
          int mid= l+(r-l)/2;
  
          if(arr[mid]== target) return mid;
  
          else if(arr[mid]<target)
              l= mid+1;
          else
            r= mid-1;
      }
      return -1;
    }  
  }