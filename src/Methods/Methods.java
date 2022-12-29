package Methods;

public class Methods {
    public static void main(String[] args){

        String textInp = "JAVA";
        int sum1 = 10;
        int sum2 = 12;
        met1(); //secondary method must be called in the main method
        System.out.println("------------------------------");
        met2(textInp);
        System.out.println("------------------------------");
        System.out.println(met3(sum1, sum2));
/*        int result = met3(sum1, sum2);
        System.out.println(result);*/
    }
    static void met1(){
        System.out.println("Method No1");
    }
    static void met2(String s){
        System.out.println("Method No2");
        System.out.println(s);
    }
    static int met3(int x, int y){
        System.out.println("Method No3");
        int res = x + y;
        return res;
    }
}
