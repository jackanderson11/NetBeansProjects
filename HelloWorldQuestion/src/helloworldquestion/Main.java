
package helloworldquestion;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!"+"\n"+"Here are some facts about me!");
        HelloWorldQuestion Jack = new HelloWorldQuestion("Jack", 16, 11);
        System.out.println(Jack.getmessage());
        
        System.out.println("What is your name?");
        Scanner userinput = new Scanner (System.in);
        System.out.println("\n"+userinput.nextLine()+" is an awesome name!"+"\n"+"It is very nice to meet you!");
        
    }
}
