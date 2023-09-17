package OOPS;

import javax.print.attribute.standard.PrinterMessageFromOperator;

//Super Keyword

// is used to refer immediate parent class object.
// To access parent properties
// To access parent Method/Constructor.

//Example
public class Super_Keyword 
{
    public static void main(String[] args) 
    {
        A b=new B();
        b.print();
    }
}

class A
{
    void print()
    {
        System.out.println("This is A class");
    }
}

class B extends A
{
    void print()
    {
        System.out.println("This is B class");
        super.print(); //Super key is used to access parent's print() method.
    }
}
