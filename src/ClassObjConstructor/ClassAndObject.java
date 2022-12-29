package ClassObjConstructor;

class Table {
    String type;
    int height;
    int width;
    String color;
}

public class ClassAndObject {
    public static void main(String[] args) {
        Table alpina = new Table();
        alpina.type = "laptop";
        alpina.width = 100;
        alpina.height = 150;
        alpina.color = "brown";
        System.out.println("Our table type is " + alpina.type);
    }
}
