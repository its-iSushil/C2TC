package Bit_manipulation;
import java.util.Scanner;

//Program to convert binary number to decimal number
public class Binary_To_Decimal {

    private static int returnDecimal(int binary){
        int decimal=0;
        int pow=0;
        while(binary>0){
            int lastDigit=binary%10;
            decimal=(int) (decimal+(lastDigit*Math.pow(2, pow)));
            pow++;
            binary/=10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println("Enter any binary number:");
        Scanner scan=new Scanner(System.in);
        int binary=scan.nextInt();
        
        System.out.println("Decimal number of "+binary+" is "+returnDecimal(binary));
    }
}
