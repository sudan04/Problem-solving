package Recursion;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println("No of zeros: "+ countZeros(3040200304L, 0));
    }

    static int countZeros(long n, int count){
        if(n==0) return count;

        if(n%10==0) {
            count++;
        }
        return countZeros(n/10, count);
    }
}
