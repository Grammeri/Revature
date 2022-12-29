package Methods;

public class OverloadMethod {
    public static void main(String[] args) {

        int sum1 = 10;
        int sum2 = 12;
        int sum3 = 20;
        sum();
        System.out.print(sum(sum1,sum2));
        System.out.print(sum(sum1,sum2, sum3));
    }

    static void sum() {
        System.out.println("Application for adding numbers");
    }
    static double sum(int x, int y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}
