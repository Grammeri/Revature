package JavaNative.Cycles;

public class CycleDoWhile {
    public static void main (String[] args){
        int i = 1;
        int x = 3;
        do{
            System.out.printf("%s * %s = %s\n", i,x,i*x);
            i++;
        }
        while(i<=9);
        }
    }

