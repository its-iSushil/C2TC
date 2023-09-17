public class multiply_two_strings 
{
    public static void main(String[] args)
    {
        String a="22";
        String b="10";
        int x=0,y=0;
        for(int i=0;i<a.length();i++)
            System.out.println(Integer.valueOf(a.charAt(i)));
        for(int i=0;i<b.length();i++)
            y=y*10+b.charAt(i);
        System.out.println(x);
        System.out.println(y);
        System.out.println((x*y));
    }
}
