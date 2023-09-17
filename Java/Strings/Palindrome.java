/* Check Weather a Entered String is Palindrome or Not. 
 * Example of Palindrome String: abba,baab,abcfcba.
 * Example of Palindrome String: abab,sdf
*/

import java.util.Scanner;
class palindrome
{
    
    public static void main(String[] args)
    {
        System.out.println("Enter any string: ");
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        boolean flag=false;
        int i=0,j=word.length()-1;
        while(i<j && flag==false)
        {
            if(word.charAt(i)!=word.charAt(j))
            {
                flag=true;
                break;
            }
            else
            {
                i++;
                j--;
            }
        }
        if(flag==false)
            System.out.println("'"+word+"' is a palindrome");
        else
            System.out.println("'"+word+"' is not not palindrome");

    }
}