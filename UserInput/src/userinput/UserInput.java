
package userinput;
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {
        System.out.print("Enter 2 Player Names..."+"\n");
        Scanner p1name = new Scanner(System.in);
        StringBuffer input1 = new StringBuffer();
            input1.toString();
        System.out.println("Player 1 Name: "+p1name.nextLine());
        
        Scanner p2name = new Scanner(System.in);
        StringBuffer input2 = new StringBuffer();
            input2.toString();
        System.out.println("Player 2 Name: "+p2name.nextLine());
        
        if(p1name == p2name){
            System.out.println("You guys have the same name!");
        }else{
            System.out.println("You guys have cool names!");
        }
    }

}