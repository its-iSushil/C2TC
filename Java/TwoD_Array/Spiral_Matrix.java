package TwoD_Array;

public class Spiral_Matrix 
{
    public static void main(String[] args) 
    {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int srow=0;
        int scol=0;
        int erow=matrix.length-1;
        int ecol=matrix[0].length-1;
        int i;

        while(srow<=erow && scol<=ecol)
        {
            //top row
            for(i=scol;i<=ecol;i++)
                System.out.print(matrix[srow][i]+" ");
            //right
            for(i=srow+1;i<=erow;i++)
                System.out.print(matrix[i][ecol]+" ");
            //bottm
            for(i=ecol-1;i>=scol;i--)
                System.out.print(matrix[erow][i]+" ");
            //left
            for(i=erow-1;i>=srow+1;i--)
                System.out.print(matrix[i][scol]+" ");

            srow++;
            scol++;
            erow--;
            ecol--;

        }
    }
}
