package Recursion;

public class OneToN {
    public static void main(String[] args) {
        int n=10;
        printNNumbers(n);
    }

    public static void printNNumbers(int n){
        if(n==0) return;
        printNNumbers(n-1);
        System.out.println(n);
        
    }
}
