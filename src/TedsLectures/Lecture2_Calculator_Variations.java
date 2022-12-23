
package TedsLectures;

import java.util.Scanner;

public class Lecture2_Calculator_Variations {
    public static void main(String[] args){
        System.out.println("Input the first number:");


        int number1 = new Scanner(System.in).nextInt();//Instead of lines: 90, 93

        System.out.println("Input the second number:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Select multiply, divide, subtract or add:");
        String action = new Scanner(System.in).nextLine();

        if(action.equals("multiply")){
            int result = multiply(number1,number2);
            System.out.println("Answer is " + result);
        }
        if(action.equals("divide")){
            int result = divide(number1, number2);
            System.out.println("Answer is " + result);
        }
        if(action.equals("subtract")){
            int result = subtract(number1,number2);
            System.out.println("Answer is " + result);
        }
        if(action.equals("add")){
            int result = add(number1,number2);
            System.out.println("Answer is " + result);
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