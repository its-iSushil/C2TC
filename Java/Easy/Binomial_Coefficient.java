package Easy;

import java.util.Scanner;

import Recursion.print_desc_no;

// Binomial Coefficient formula: nCr = n! / r!(n-r)! 

public class Binomial_Coefficient {
    public static void main(String[] args) {
        System.out.println("Enter valur for n and r");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int r=scan.nextInt();
        System.out.println("nCr is "+nCr(n,r));
    }
    private static int nCr(int n, int r){
        int nFact=findFactorial(n);
        int rFact=findFactorial(r);
        int nrFact=findFactorial(n-r);
        return nFact/(rFact*nrFact);
    }
    private static int findFactorial(int n) {
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        return fact;
    }

}
