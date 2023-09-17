package Bit_manipulation;

import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a binary number :");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rem=0,temp=0;
        double dn=1;
        while(n>0)
        {
            temp=n%10;
            dn=temp*(Math.pow(2, rem));
            n=n/10;
            rem++;
        }
        System.out.println("Decimal no is : "+dn);
    }
}
