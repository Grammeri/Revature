
package TedsLectures;

import java.util.Scanner;

public class Lecture2_Calculator_Variation_2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number:");
        int number1 = sc.nextInt();

        System.out.println("Input the second number:");
        int number2 = sc.nextInt();

        System.out.println("Select 1 for multiply, 2 for divide, 3 for subtract or 4 for add:");
        /*String action = new Scanner(System.in).nextLine();*/
        int action = sc.nextInt();

        if(action == 1){
            int result = multiply(number1,number2);
            System.out.println("Answer is " + result);
        }
        if(action == 2){
            int result = divide(number1, number2);
            System.out.println("Answer is " + result);
        }
        if(action == 3){
            int result = subtract(number1,number2);
            System.out.println("Answer is " + result);
        }
        if(action == 4){
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