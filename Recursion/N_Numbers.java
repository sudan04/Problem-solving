package Recursion;

public class N_Numbers {
    public static void main(String[] args) {
        int n=10;
        printNNumbers(1,n);
    }

    public static void printNNumbers(int low, int n){
        if(low>n) return;
        System.out.println(low);
        printNNumbers(++low, n);
        
    }
}
