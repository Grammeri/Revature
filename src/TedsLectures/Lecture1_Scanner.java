package TedsLectures;
/*class Rev {
    public static void main(String args[])
    {
        // First label
        first:
        for (int i = 0; i < 3; i++) {
            // Second label
            second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {

                    // Using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}*/

import java.util.Scanner;

public class Lecture1_Scanner { //class header, public - Java keyword access specifier (unrestricted access); class - beginning of
    //class definition
    public static void main(String[] args) { //method header; beginning of method; starting point of application
        System.out.println("Please input a number: "); //"Please input a number: " - string literal
        Scanner sc = new Scanner(System.in); //System.in is Java Object; sc is a class type variable; datatype of sc is Scanner
        //new creates an object in memory
        int number = sc.nextInt();

        System.out.println((number > 0) ? "You inputted a positive number" : "You inputted a negative number" );

        /*if (number > 0) {
            System.out.println("You inputted a positive number");
        } else if (number < 0) {
            System.out.println("You inputted a negative number");
        }*/
    }

    /*
     * Today's topics -
     * the main method,
     * the scanner class,
     * the system.out.println statement,
     * code compilation
     * if/else statement
     */
}