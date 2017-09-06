package human;

public class Human {
    private String Name;
    private String EyeColor;
    private int Age;
    private int Grade;
    private double Height;
    private String MomName;
    private String DadName;
    
    public Human (String MyName, String MyEyeColor, int MyAge, int MyGrade, double MyHeight, String MyMomName, String MyDadName)
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
    
        
    
    
    
}