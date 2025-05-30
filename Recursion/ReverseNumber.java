package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        long n=35462;
        System.out.println("Reverse of "+ n+": "+ reverseNumber(n,0));        
    }

    static long reverseNumber(long n, long rev){
        if(n==0) return rev;
        rev= n%10+ rev*10;
        return reverseNumber(n/10, rev);
    }
}
