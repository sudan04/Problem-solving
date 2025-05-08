public class RotationCountInArray {
    public static void main(String[] args){
        int arr[]={7,8,9,10,1,3,5,6};
        int res= countRotaion(arr);
        System.out.println(res);
    }

    public static int countRotaion(int[] arr){
        int l=0, r= arr.length-1;

        // find the pivot index: pivot+1 will be the rotation count of the array
        while(l<r){
            int mid= l+(r-l)/2;

            if(arr[mid]>arr[r]){
                l=mid+1;
            }else
                r=mid;
        }
        return l;
    }
}
