package TedsLectures;

import java.util.Scanner;

public class Lecture2_Calculator {
    /**
     * I want to make a calculator app
     * for the start, I want to be able to multiply and divide numbers
     * @param args
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number:");
        // after getting a bit of text from the user, convert that into a double
        String n1input = sc.nextLine(); // how it knows that we need to scan data after "input first number"
        double n1 = Double.parseDouble(n1input);

        System.out.println("input second number");
        String n2input = sc.nextLine();
        double n2 = Double.parseDouble(n2input);

        System.out.println("input 'multiply' or 'divide'");
        String action = sc.nextLine();

        if(action.equals("multiply")){//can be hz instead of "multiply"
            double result = multiply(n1, n2); // what is multiply here, it is before multiply method on line 35
            System.out.println("result: "+result);
        }else if(action.equals("divide")){
            double result = divide(n1, n2);
            System.out.println("result: "+result);
        }
    }

    public static double multiply(double a, double b){ // we are already doing multiplication in line 27
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    /*
     * let's decide on what primitive datatype we'll be using
     * bytes (very short numbers)
     * shorts (short numbers)
     * ints (whole numbers up to about ~2 billion)
     * floats (decimal numbers that tend to be inaccurate)
     * doubles (accurate decimal numbers)
     * booleans (true/false values)
     * char (single characters)
     */

    /**
     * generally, methods
     * method return types
     * method parameters
     * primitive types
     * Strings
     */
}