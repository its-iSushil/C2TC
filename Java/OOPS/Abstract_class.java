package OOPS;

// Abstract class :
    // Cannot create object of abstract class.
    // can have constructors.
    //can have abstract / not abstract methods.


public class Abstract_class 
{
    public static void main(String[] args) 
    {
        
    }
}

abstract class animal  // animal is a abstract class
{
    void eat()  //eat() is not abstract method.
    {
        System.out.println("eats veg food");
    }

    abstract void walk();  
    //walk() is abstract method, this will be defined/initialized by child classes.
}

class elephant extends animal
{
    //class elephant is getting error because class elephant
    // should have walk() method defined.
}

class cat extends animal
{
    void walk()
    {
        System.out.println("cat walk on 4 legs");
    }
}
