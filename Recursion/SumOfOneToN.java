package Recursion;

public class SumOfOneToN {
    public static void main(String[] args) {
        System.out.println(sumToN(100));
    }

    // return sum of all numbers from 1 to n
    static int sumToN(int n){
        if(n==1) return 1;

        return n+ sumToN(n-1);
    }
}
