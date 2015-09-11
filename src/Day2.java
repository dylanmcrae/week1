import TerminalIO.*;

public class Day2{
    
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        int age;
        age = r.readInt("How old are you");
        age++;
        System.out.println("Next Year you will be" + age);
    }
    
}
