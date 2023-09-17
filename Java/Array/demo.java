//Check two given array are equal or not
/* A[0,8,4,6]
 * B[4,0,8,6]
*/

import java.util.Scanner;

public class demo
{
    public static void name(String[] args) 
    {
        int n,i;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array length:");
        n=scan.nextInt();
        int A[]=new int[n];
        int B[]=new int[n];
        System.out.println("Enter elements of A[]:\n");
        for(i=0;i<n;i++)
            A[i]=scan.nextInt();
        System.out.println("Enter elements of B[]:\n");
        for(i=0;i<n;i++)
            B[i]=scan.nextInt(); 
        if(isEqual(A,B,n))
            System.out.println("Array A & B are equal");
        else
            System.out.println("Array A & B are not equal");

    }
    static boolean isEqual(int A[],int B[],int n)
    {
        
        for(int i=0;i<n;i++)
        {
            if(A[i]!=B[i])
                return false;
        }
        return true;
    }
}