package Easy;
import java.util.Scanner;

//Program to calculate factorial of given number

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter value for n:");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int fact=findFactorial(n);
        System.out.println("factorial of "+n+" is "+fact);
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
