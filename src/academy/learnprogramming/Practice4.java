package academy.learnprogramming;

public class Practice4 {
    // Convert the string "3.14" into a numeric value, and then display the square of the value

    public static void main(String[] args) {
        String pi = "3.14";
        double d1, d2;
        d1 = Double.parseDouble(pi);
        d2 = Math.pow(d1, 2);

        System.out.println(d2);


    }

}
