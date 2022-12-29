
package TedsLectures;

import java.util.Scanner;

public class Lecture_Calculator_Variation_1_switch {
    public static void main(String[] args){
        System.out.println("Input the first number:");


        int number1 = new Scanner(System.in).nextInt();//Instead of lines: 90, 93

        System.out.println("Input the second number:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Select multiply, divide, subtract or add:");
        String action = new Scanner(System.in).nextLine();

        switch(action){
            case "multiply":
                int result1 = multiply(number1,number2);
                System.out.println("Answer is " + result1);
            case "divide":
                int result2 = divide(number1, number2);
                System.out.println("Answer is " + result2);
            case "subtract":
                int result3 = subtract(number1,number2);
                System.out.println("Answer is " + result3);
            case "add":
                int result4 = add(number1,number2);
                System.out.println("Answer is " + result4);
            default: System.out.println("Error!");
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