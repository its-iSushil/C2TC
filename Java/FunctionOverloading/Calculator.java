package FunctionOverloading;

//Program to demonstrate function overloading.

public class Calculator {

    //Function to calculate sum of two number
    private static int sum(int a,int b){
        return a+b;
    }

    //Function to calculate sum of three number
    private static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,15));
        System.out.println(sum(5,15,10));
    }
}
