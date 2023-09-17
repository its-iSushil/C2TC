package TwoD_Array;

public class Diagonal_Sum 
{
    public static int diagonalsum(int matrix[][])
    {
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
           
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
                sum+=matrix[i][i];  
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int sum=0;
        int matrix[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12},{14,15,17,13}};
        // for(int i=0;i<matrix.length;i++)   
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         //primary diagonal
        //         if(i==j)
        //             sum=matrix[i][j]+sum;
        //         //secondary diagonal
        //         if(i+j==matrix.length-1)
        //             sum=matrix[i][j]+sum;
        //     }
        // }
        int sum1=diagonalsum(matrix);
        System.out.println("Diagonal sum is : "+sum1);
    }
}
