
package main;

import java.util.Scanner;

public class HumanChar {
 private String Name;
    private String EyeColor;
    private int Age;
    private int Grade;
    private double Height;
    private String MomName;
    private String DadName;
    
    public HumanChar (String MyName, String MyEyeColor, int MyAge, int MyGrade, double MyHeight, String MyMomName, String MyDadName)
    {
    Name = MyName;
    EyeColor = MyEyeColor;
    Age = MyAge;
    Grade = MyGrade;
    Height = MyHeight;
    MomName = MyMomName;
    DadName = MyDadName;
    }
    
    public String getmessage()
    {
    return
            "Name: "+Name+"\n" +"Eye Color: "+EyeColor+"\n" +"Age: "+Age+"\n" +"Grade: "+Grade+"\n" +"Height (in.): "+Height+"\n" +"Mom's Name: "+MomName+"\n" +"Dad's Name: "+DadName+"\n";
    }
    public static void main(String[] args) {

    }
    
}

public class Main {

    public static void main(String []args){
        System.out.println("Hello World! Here are some facts about me...");
        HumanChar Jack = new HumanChar("Jack", "Blue", 16, 11, 69, "Kathryn Anderson", "Michael Anderson");
        HumanChar Bo = new HumanChar("Bo", "Brown", 14, 9, 64, "Kathryn Anderson", "Michael Anderson");
        HumanChar Max = new HumanChar("Max", "Brown", 17, 12, 68, "Kathryn Anderson", "Michael Anderson");
       
        System.out.println(Jack.getmessage()+"\n"+"Here is my younger brother..."+"\n"+Bo.getmessage()+"\n"+
                "Here is my older brother..."+"\n"+Max.getmessage());
        
        System.out.println("What is your name?");
        Scanner userinput = new Scanner(System.in);
        System.out.println("\n"+userinput.nextLine()+" is an awesome name!");
        System.out.println("It is very nice to meet you!");
    }
    
}

