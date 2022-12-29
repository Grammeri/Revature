package ClassObjConstructor;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

class Homosapience {
    String name;
    String gender;
    String birthdate;
    int height;
    String eyeColor;

    public void sayWho() {
        System.out.println("My name is " + name + " I am a " + gender);
        System.out.println("I was born in " + birthdate);
        System.out.println("My height is " + height + " cm");
        System.out.println("I have " + eyeColor + " eyes");
    }

    public int count(int x1, int x2) {
        int res = x1 + x2;
        return res;
    }

    Homosapience(String x1, String x2, String x3, int x4, String x5) {
        name = x1;
        gender = x2;
        birthdate = x3;
        height = x4;
        eyeColor = x5;
    }

    Homosapience() {
        Random rnd = new Random();
        height = rnd.nextInt(200);

        String rndArray[] = {"Yana", "Vova", "Kolya"};
        name = rndArray[rnd.nextInt(rndArray.length)];

        String colorArray[] = {"blue", "black", "gray"};
        eyeColor = colorArray[rnd.nextInt(rndArray.length)];

        String genderArray[] = {"male", "female", "not sure"};
        gender = genderArray[rnd.nextInt(rndArray.length)];

        birthdate = String.valueOf(rnd.nextInt(30)+1)+"."+String.valueOf(rnd.nextInt(12)+1)+"."+String.valueOf(rnd.nextInt(2000)+1);


    }
}


class CreatePeople {
    public static void main(String[] args) {

        Homosapience id357 = new Homosapience();

        id357.sayWho();
        System.out.println("I can add numbers");
        int y = id357.count(5, 6);
        System.out.println(y);
    }
}


