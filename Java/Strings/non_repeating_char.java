import java.util.HashMap;
import java.util.Scanner;

//Finding non-repeating character in a given word
//Concept used: HashMap 
public class non_repeating_char 
{
    public static void main(String[] args)
    {
        System.out.println("Enter world: ");
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        int fre;
        HashMap <Character,Integer> hash=new HashMap<Character,Integer>();
        for(int i=0;i<word.length();i++)
        {
            if(hash.containsKey(word.charAt(i))==false)
                hash.put(word.charAt(i), 1);
            else
            {
                fre=hash.get(word.charAt(i));
                fre++;
                hash.put(word.charAt(i),fre);
            }
        }
        boolean flag=false;
        for(int i=0;i<word.length();i++)
        {
            Character curr=word.charAt(i);
            if(hash.get(curr)==1)
            {
                flag=true;
                System.out.println(curr);
                break;
            }
        }
        if(flag==false)
            System.out.println("not");
    }
}
