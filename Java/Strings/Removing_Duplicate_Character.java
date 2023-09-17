/* Problem Statement: Remove duplicate character in a given string 
 * Input1 : Hello   Input2: success
 * Output1: Helo    Output2: suce
 * 
*/

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;


public class Removing_Duplicate_Character 
{
    public static void main(String[] args)
    {
        System.out.println("Enter any string:");
        Scanner scan=new Scanner(System.in);
        String S=scan.next();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        int len=S.length();
        int freq;
        for(int i=0;i<len;i++)
        {
            if(map.containsKey(S.charAt(i))==false)
                map.put(S.charAt(i),1);
            else
            {
               freq=map.get(S.charAt(i));
               freq++;
               map.put(S.charAt(i),freq);
            }
        }
        String str="";
        for(Entry<Character, Integer> data : map.entrySet())
        {
            str=str+data.getKey();
        }
        System.out.println(str);
    }
}
