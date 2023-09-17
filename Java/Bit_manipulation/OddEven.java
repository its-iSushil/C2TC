package Bit_manipulation;

import java.util.Scanner;

public class OddEven 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a binary number :");    
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int n=b%10;
        if(n==1)
            System.out.println("Number is odd");
        else
            System.out.println("Number is even"); 
    }
}
