import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) 
    {
        // int[] arr={7,1,5,3,6,4};
        // System.out.println("Max Profit: "+maxStockProfit(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        boolean flag=true;
       for(int i=2;i<Math.sqrt(n);i++)
       {
            if(n%i==0)
                flag=false;
       }
       if(!flag)
            System.out.println("not prime");
        else
        System.out.println("prime");
    }
    // static int maxStockProfit(int[] prices) {
    //     int maxProfit=0;
    //     int minSoFar=prices[0];

    //     for(int i=0;i<prices.length;i++){
    //         minSoFar=Math.min(minSoFar,prices[i]);
    //         int profit=prices[i]-minSoFar;
    //         maxProfit=Math.max(maxProfit,profit);
    //     }
    //     return maxProfit;
    // }
}
