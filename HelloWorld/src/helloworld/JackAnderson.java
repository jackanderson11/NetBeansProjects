
package helloworld;

public class JackAnderson {
    private String message;
    
    public JackAnderson(){
            message="Hello World, call me Jack";
    }
    public String getmessage(){
       return message;
    }
    
    public static void main(String[] args){
       JackAnderson Jack = new JackAnderson();
       System.out.println(Jack.getmessage());
    }

    
}
