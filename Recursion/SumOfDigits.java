package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        long n= 6786;
        System.out.println("Sum of digits in "+ n+": "+sumOfDigits(n));
        System.out.println("Product of digits in "+ n+": "+productOfDigits(n));
    }

    // finds the sum of digits of a number( n=1234, return 1+2+3+4)
    static long sumOfDigits(long n){
        if(n==0) return 0;

        return n%10 + sumOfDigits(n/10);
    }

    // finds the product of digits of a number( n=1234, return 1*2*3*4)
    static long productOfDigits(long n){
        if(n==0) return 1;

        return n%10 * productOfDigits(n/10);
    }
}
