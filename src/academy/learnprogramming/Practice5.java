package academy.learnprogramming;

public class Practice5 {
    // Q. What kind of exception will occur when an integer is divided by 0?
    // A. ArithmeticException
    // Write a program displaying a message for the exception
    public static void main(String[] args) {
        int value1 = 5;
        int value2;
        try {
            value2 = value1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("you tried to divide a number by zero.");
        }
    }




}
