package TedsLectures6_PiggyBank;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        PiggyBank b = new PiggyBank(1.50);


        Scanner sc = new Scanner (System.in);
        PiggyBankService bankService = new PiggyBankService(b);

        while(true){
            System.out.println("If you want to deposit quarter write deposit");
            System.out.println("If you want to break piggybank write break");
            String input = sc.nextLine();
            if(input.equals("deposit")){
                // deposit a quarter
                bankService.depositQuarter();

            }else if(input.equals("break")){
                // break the piggy bank and display the total amount contained
                double finalbalance = bankService.breakPiggyBankAndReturnBalance();
                System.out.println(finalbalance);
                break;
            }
        }
    }
}

/* * today's concepts -
 * more about OOP, creating service and model classes
 * writing constructors
 * a little bit about unit testing*/


