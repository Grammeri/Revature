package Exceptions;

public class Main {
    public static void main(String[] args) {
        OddCalculator calc = new OddCalculator();
        try {
            int sum = calc.sumOddNumbers(3, 5);
            System.out.println(sum);
        } catch (EvenNumberException e) {
            e.printStackTrace();
        }
    }
}
