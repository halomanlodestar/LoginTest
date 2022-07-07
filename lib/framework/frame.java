package framework;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {

    protected static Font titleFont = new Font("Minecraft Ten", 1, 30);
    static Font subTitle = new Font("Minecraft Ten", 1, 22);
    static Font McButton = new Font("Minecraft Ten", 0, 20);
    protected static Font baseFont = new Font("Mojang", 1, 13);
    //static Font censored = new Font("Segoe MDL2 Asset", 1, 13);
    protected static Font _font = new Font("Mojang", 0, 12);
    private static Image stone = (new ImageIcon("D:\\_SPACE\\JLearn\\OTP_GEN\\src\\stoneimg.png")).getImage();
    public static ImageIcon StoneImg = new ImageIcon(stone.getScaledInstance(500,350,Image.SCALE_SMOOTH));

    public frame() {
    new JFrame();
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setVisible(true);
    }
}