public class Example {
    public static void main(String[] args) {
        int arr[]={23,4,4,2,6};
        int s= 3;
        try {
            s= s*2;
            System.out.println(arr[s]);
        } catch (Exception e) {
            System.out.println(s);
        }
    }
}
