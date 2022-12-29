package JavaNative.Cycles;

public class CycleFor {
    public static void main (String[] args){
        int x = 5;
        for (int i=1; i<=10; i++){
            if(i%2  !=0){continue;}
            System.out.printf("%s * %s = %s\n", i,x,i*x);
        }
    }
}
