import java.util.Arrays;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        int size;
        System.out.println("Enter size:");
        Scanner scan=new Scanner(System.in);
        size=scan.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
            arr[i]=scan.nextInt();

        Arrays.sort(arr);
        System.out.println("Sorted array elements are:");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");

        System.out.println("\nEnter key value to be searched :");
        int key=scan.nextInt();
    
        if(Arrays.binarySearch(arr, key)>=0)
            System.out.println("The key value is present at index:"+Arrays.binarySearch(arr, key));
        else
        System.out.println("\nKey not found");
        scan.close();
    }
}
