
package helloworldquestion;

public class HelloWorldQuestion {
        private String Name;
        private int Age;
        private int Grade;
        
        public HelloWorldQuestion(String myname, int myage, int mygrade) 
        {
        Name = myname;
        Age = myage;
        Grade = mygrade;
        }
        
        public String getmessage()
        {
            return
                    "Name: "+Name+"\n"+"Age: "+Age+"\n"+"Grade: "+Grade+"\n";
        }
               
    }
    
