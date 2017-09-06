
package human;

import java.util.Scanner;

public class Main {

    public static void main(String []args){
        System.out.println("Hello World! Here are some facts about me...");
        Human Jack = new Human("Jack", "Blue", 16, 11, 69, "Kathryn Anderson", "Michael Anderson");
        Human Bo = new Human("Bo", "Brown", 14, 9, 64, "Kathryn Anderson", "Michael Anderson");
        Human Max = new Human("Max", "Brown", 17, 12, 68, "Kathryn Anderson", "Michael Anderson");
       
        System.out.println(Jack.getmessage()+"\n"+"Here is my younger brother..."+"\n"+Bo.getmessage()+"\n"+
                "Here is my older brother..."+"\n"+Max.getmessage());
        
        System.out.println("What is your name?");
        
        Scanner userinput = new Scanner(System.in);
        System.out.println("\n"+userinput.nextLine()+" is an awesome name!");
        
        System.out.println("It is very nice to meet you!");

    }
    
    
}

















// Human Josh = new Human("Joshua", "Brown", 16, 11, 68, "Gretchen Luther", "Jarrett Luther");
// +"\n"+"Here is my best friend..."+"\n"+Josh.getmessage()