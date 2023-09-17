package Stack;

/* Example:
 * input: []() --> output:true
 * input: [(]  --> output:false
 */

import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String of Parentheses:");
        String str=scan.nextLine();

        //Create stack:
        if(isValid(str))
            System.out.println("Valid String");
        else
        System.out.println("Invalid String");

        

    }
    static boolean isValid(String str){
            Stack<Character> stack=new Stack<Character>();
            for(int i=0;i<str.length();i++)
            {
            if(str.charAt(i)=='(')
                stack.push(')');
            else if(str.charAt(i)=='[')
                stack.push(']');
            else if(str.charAt(i)=='{')
                stack.push('}');
            else if(stack.isEmpty() || stack.pop()!=str.charAt(i))
                return false;

            }
            return stack.isEmpty();
        }
    
}
