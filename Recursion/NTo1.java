package Recursion;

public class NTo1 {
    public static void main(String[] args) {
        int n=10;
        // printNum(n);
        // System.out.println();
        printDscAndAsc(n);
    }

    // print n to 1 
    static void printNum(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printNum(n-1);
    }


    // first prints Nto1 and then 1ToN
    static void printDscAndAsc(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printDscAndAsc(n-1);

        if(n==1) System.out.println();
        System.out.print(n+" ");
    }
}
