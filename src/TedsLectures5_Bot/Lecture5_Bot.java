package TedsLectures5_Bot;

import java.util.Scanner;


public class Lecture5_Bot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input language 1:");
        String language1 = sc.nextLine();
        System.out.println("input language 2:");
        String language2 = sc.nextLine();

        ChatbotService chatService1 = new ChatbotService();
        chatService1.language = language1; //eg english

        ChatbotService chatService2 = new ChatbotService();
        chatService2.language = language2; //eg spanish

        String result1 = chatService1.helloMessage();
        System.out.println(result1);

        String result2 = chatService2.helloMessage();
        System.out.println(result2);
    }
}
/*
 * key takeaways:
 * we're able to define a new 'custom datatype' called a class (and java makes everything a class, basically)
 * we're able to create new instances of that custom datatype known as objects
 * the class, which functions as a template or blueprint for objects, can have different variables (which we call fields, states)
 *      as well as methods (behaviors), and the behavior of those methods could change depending on the object's own individual fields
 * the process of creating a new object is known as instantiation
 * oop is good :^) but it's tricky to figure out!
 */