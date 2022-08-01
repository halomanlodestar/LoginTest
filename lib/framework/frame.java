package framework;

import javax.swing.*;
import java.awt.*;

public class frame extends JFrame {

    public static Font titleFont = new Font("Minecraft Ten", 1, 30);
    protected static Font subTitle = new Font("Minecraft Ten", 1, 22);
    public static Font McButton = new Font("Minecraft Ten", 0, 20);
    public static Font baseFont = new Font("Mojang", 1, 13);
    //static Font censored = new Font("Segoe MDL2 Asset", 1, 13);
    public static Font inputFont = new Font("Mojang", 0, 12);
    private static Image ExitImg = new ImageIcon("D:\\_SPACE\\JLearn\\OTP_GEN\\textures\\arrowLeft.png").getImage();
    public static ImageIcon ExitIcon = new ImageIcon(ExitImg.getScaledInstance(16, 16, Image.SCALE_SMOOTH));
    public static Font _backFont = new Font("Minecraft Ten", 0, 11);
}