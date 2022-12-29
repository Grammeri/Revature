package JavaNative.Cycles;

import java.util.Scanner;

public class CycleFeature {
    public static void main(String[] args) {

        boolean t = true;

        do {
            int i = 1;
            int x = 3;
            while (i <= 9) {
                System.out.printf("%s * %s = %s\n", i, x, i * x);
                i++;
                if (i == 5) {
                    break;
                }
            }
            System.out.println("want to proceed ? YES-1, NO-2");
            int ref = new Scanner(System.in).nextInt();
            if (ref == 2) {
                t = false;
                System.out.println("Cycle is stopped!");
            }

        } while (t);
    }
}


