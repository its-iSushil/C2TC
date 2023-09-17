package OOPS;

public class Setter_and_getter 
{
    public static void main(String[] args) 
    {
        pen p=new pen(); // "p" is a object of class "pen"
        p.setColor("red");
        String col=p.getColor();
        System.out.println(col);
    }
}

class pen
{
    String color;
   
    //Setter : setter method which is used to set value to the object.
    void setColor(String colour)
    {
        color=colour;
    }

    //Getter : getter method is used to get values of particular object using "this" keyword.
    String getColor()
    {
        return this.color;
    }
}
