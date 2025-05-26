package Recursion;

public class FactorialOfANumber {
    public static void main(String[] args) {
        System.out.println(findFact(    8));
    }

    // return product of all numbers from 1 to n
    static int findFact(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        
        return n*findFact(n-1);
    }
}
