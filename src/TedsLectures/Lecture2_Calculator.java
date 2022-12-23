
package TedsLectures;

import java.util.Scanner;

/*public class Lecture2_Calculator {

*
     * I want to make a calculator app
     * for the start, I want to be able to multiply and divide numbers
     * @param args



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number:");
        // after getting a bit of text from the user, convert that into a double
        String n1input = sc.nextLine();
        double n1 = Double.parseDouble(n1input);

        System.out.println("input second number");
        String n2input = sc.nextLine();
        double n2 = Double.parseDouble(n2input);

        System.out.println("input 'multiply' or 'divide'");
        String action = sc.nextLine();

        if(action.equals("multiply")){
            double result = multiply(n1, n2);
            System.out.println("result: "+result);
        }else if(action.equals("divide")){
            double result = divide(n1, n2);
            System.out.println("result: "+result);
        }

        double result1 = multiply(n1, n2);
        double result2 = divide(n1,n2);
        double result3 = subtract(n1,n2);
        double result4 = add(n1,n2);
        System.out.println(action.equals("multiply")
                ? (result1)
                : (action.equals("divide") ? result2 : break)
                ? (result2))
                : (action.equals("subtract"))
                : (result3)
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }
    public static double add(double a, double b){
        return a/b;
    }

     * let's decide on what primitive datatype we'll be using
     * bytes (very short numbers)
     * shorts (short numbers)
     * ints (whole numbers up to about ~2 billion)
     * floats (decimal numbers that tend to be inaccurate)
     * doubles (accurate decimal numbers)
     * booleans (true/false values)
     * char (single characters)



*
     * generally, methods
     * method return types
     * method parameters
     * primitive types
     * Strings


}*/



public class Lecture2_Calculator {
    public static void main(String[] args){
        //Create Scanner
        /*Scanner sc = new Scanner(System.in);*/
        //Get instruction to input the first number and scan the number
        System.out.println("Input the first number");
       /* int number1 = sc.nextInt();*/

        int number1 = new Scanner(System.in).nextInt();//Instead of lines: 90, 93

        //Get instruction to input the second number and scan the number
        System.out.println("Input the second number");
        int number2 = new Scanner(System.in).nextInt();

        //Select/scan action
        System.out.println("Select multiply, divide, subtract or add");
        String action = new Scanner(System.in).nextLine();
        //
        if(action.equals("multiply")){
            int result = multiply(number1,number2);
            System.out.println("Answer is" + result);
        }
        if(action.equals("divide")){
            int result = divide(number1, number2);
            System.out.println("Answer is" + result);
        }
        if(action.equals("subtract")){
            int result = subtract(number1,number2);
            System.out.println("Answer is" + result);
        }
        if(action.equals("add")){
            int result = add(number1,number2);
            System.out.println("Answer is" + result);
        }
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a,int b){
        return  a/b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int add(int a, int b){
        return a+b;
    }
}