import java.util.Scanner;

public class PersonDemo 
{
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of person :");
        String name=scan.next();
        System.out.println("Enter the age of person :");
        int age=scan.nextInt();
        System.out.println("Enter the gender of person :");
        String gender=scan.next();
        System.out.println("Enter the income of person :");
        int income=scan.nextInt();

        Person p=new Person();
        p.setName(name);
        p.setAge(age);
        p.setGender(gender);
        p.setIncome(income);
        System.out.println();
        System.out.println("Name: "+p.getName());
        System.out.println("Age: "+p.getAge());
        System.out.println("Gender: "+p.getGender());
        System.out.println("Income: "+p.getIncome());
        System.out.println();
        TaxCalculator t=new TaxCalculator();
        t.calculateTax(p);

        System.out.println("Tax :"+p.getTax());
        System.out.println();
        scan.close();
    }
}
