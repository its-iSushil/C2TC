package Pattern_Printing;

// A                A
// A B              B C
// A B C            D E F
// A B C D          G H I J
// A B C D E        K L M N O

public class char_half_pyramid {
    public static void main(String[] args) 
    {
        for(int i=65;i<=70;i++){
            for(int j=65;j<=i;j++)
                System.out.print((char)j+" ");
            System.out.println();
        }
        System.out.println();
        int count=64;

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print((char)count+" ");
            }    
            System.out.println();
        }
    }
    
    
}

