package TedsLectures;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Lecture4_Coffee_Shop {
    public static void main(String[] args) {
        boolean t = true;

        while (t) {
            Scanner sc = new Scanner(System.in);
            // ask the user for their balance
            // ask the user if they want esspresso or americano
            // ask the user how many they want
            // if the user inputs 0 or a negative number, produce no output
            // if the user can not afford the number of coffees requested, produce no output
            // the user should get a different message depending on the type of coffee they purchased

            double espressoPrice = 3.99;
            double americanoPrice = 2.99;
            double minPurchase = americanoPrice;

            System.out.println("whats your balance?");
            String balanceInput = sc.nextLine();
            double balance = Double.parseDouble(balanceInput);

            if (balance < minPurchase) {
                System.out.println("You do not have enough money");
                System.out.println("want to proceed ? YES-1, NO-2");
                int ref = new Scanner(System.in).nextInt();
                if (ref == 2) {
                    System.out.println("Do not forget your money next time!");
                    break;
                    // no coffee
                } else {
                    continue;
                }
            }


            {
                System.out.println("what type of coffee do you want espresso or americano?");
                String coffeeInput = sc.nextLine();
                // proceed with coffee purchase attempt?
                boolean isEspresso = coffeeInput.equalsIgnoreCase("espresso");
                boolean isAmericano = coffeeInput.equalsIgnoreCase("americano");


                System.out.println("how many do you want?");
                int amountInput = Integer.parseInt(sc.nextLine());

                if (amountInput <= 0) {
                    System.out.println("You should select at least 1 cup");
                    System.out.println("want to proceed ? YES-1, NO-2");
                    int ref = new Scanner(System.in).nextInt();
                    if (ref == 2) {
                        // no coffee
                    } else {
                        continue;
                    }
                }

                if (isEspresso && (balance >= (espressoPrice * amountInput))) {
                    // print out a successful espresso purchase message
                    System.out.println("enjoy your espresso");
                    double change = (balance - (espressoPrice * amountInput));
                    LocalDate ld1 = LocalDate.now();
                    System.out.println(ld1);

                    System.out.println("you paid " + balance);
                    System.out.println("your change is " + change);
                }
                if (isAmericano && (balance >= (americanoPrice * amountInput))) {
                    System.out.println("enjoy your americano");
                    double change = (balance - (americanoPrice * amountInput));
                    LocalDate ld1 = LocalDate.now();
                    System.out.println(ld1);

                    System.out.println("you paid " + balance);
                    System.out.println("your change is " + change);
                }
            }
            System.out.println("want to proceed ? YES-1, NO-2");
            int ref = new Scanner(System.in).nextInt();
            if (ref == 2) {
                t = false;
                System.out.println("Thank you and come again!");
                // no coffee
            }
        }
    }
}
/*
 * recommendations -
 * print the amount of change
 * picking multiple types of coffee
 * maintaining a balance outside of the while loop
 */
/*
 * if(isEspresso ){
                if(balance >= (espressoPrice * amountInput)){
                    // print out a successful espresso purchase message
                System.out.println("enjoy your espresso");
                }
            }
            if(isAmericano ){
                if(balance >= (americanoPrice * amountInput)){
                System.out.println("enjoy your americano");
                }
            }
 */