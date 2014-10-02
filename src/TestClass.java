import TerminalIO.*;

public class TestClass {
    
    public static void main (String[] args){
        KeyboardReader kr = new KeyboardReader();
        String name = kr.readLine("Enter ya name: ");
        System.out.println("The name is: " + name);
    }
}
