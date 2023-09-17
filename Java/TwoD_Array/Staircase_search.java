package TwoD_Array;

import javax.lang.model.util.ElementScanner14;

class Staircase_search
{
    public static boolean staircase(int matrix[][], int key)
    {
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0)
        {
            if(matrix[i][j]==key){
                System.out.println("Key found at index "+i+","+j);
                return true;
            }
            else if(key<matrix[i][j])
                j--;
            else 
                i++;

        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) 
    {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        staircase(matrix, 16);
        
    }
}