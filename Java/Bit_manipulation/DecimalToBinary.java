package Bit_manipulation;

import java.util.Scanner;

//program to convert decimal to binary.

public class DecimalToBinary 
{
    public static void main(String[] args)
    {
        System.out.println("Enter a decimal number:");
        Scanner scan=new Scanner(System.in);
        int decimal=scan.nextInt();

        System.out.println("Binary number of "+decimal+" is "+returnBinary(decimal));

    }

    private static int returnBinary(int decimal) {
        int pow=0,bin=0,rem=0;
        while(decimal>0){
            rem=decimal%2;
            bin=bin+(int)(rem*Math.pow(10, pow));
            pow++; decimal/=2;
        }
        return bin;
    }
}
