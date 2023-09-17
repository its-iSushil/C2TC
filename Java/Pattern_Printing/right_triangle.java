package Pattern_Printing;

class right_triangle
{
    public static void main(String[] args) 
    {
        System.out.println("Right half triangle:");
        
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}