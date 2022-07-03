import java.awt.*;

public class test {
    public static void main(String[] args) {
        
        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String name : fonts) {
            System.out.println(name.toString());
        }
    }
}
