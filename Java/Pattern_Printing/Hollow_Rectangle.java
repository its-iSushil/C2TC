package Pattern_Printing;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=10;j++){
                if(i==j)
                    System.out.println("* ");
                else
                    continue;
            }
            System.out.println();
        }
    }
}
