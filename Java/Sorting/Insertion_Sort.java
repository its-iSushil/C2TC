package Sorting;

import java.util.Scanner;

public class Insertion_Sort 
{
    public static void main(String[] args) 
    {
        int temp=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter arrray elements :");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Insertion Sort");
        for (int i = 0; i < arr.length-1; i++) 
        {
            int minpos=i;
            for(int j=i+1;j<arr.length-1;j++)
            {
                if(arr[minpos]>arr[j])
                    minpos=j;
            }
            temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
}
