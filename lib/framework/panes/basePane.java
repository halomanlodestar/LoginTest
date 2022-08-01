package framework.panes;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import framework.frame;

public class basePane extends frame {
    
    JLayeredPane base = new JLayeredPane();

    public basePane() {

        // :: Properties
        base.setBackground(new Color(0x123456));
        base.setOpaque(true);

        // @ Image Icons
        ////ImageIcon Plus = new ImageIcon(new ImageIcon("./textures/ThinPlus.png").getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));

        // @ Buttons
        JButton LoginBtn = new JButton("Login");
        LoginBtn.setBounds(100, 110, 100, 100);
        LoginBtn.setBackground(new Color(0x3b8526));
        LoginBtn.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0x6bc349), new Color(0x397f25)));
        LoginBtn.setFocusable(false);
        LoginBtn.setFont(McButton);
        LoginBtn.setForeground(Color.WHITE);

        JButton SignBtn = new JButton("SignUp");
        SignBtn.setBounds(300, 110, 100, 100);
        SignBtn.setBackground(new Color(0x3b8526));
        SignBtn.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0x6bc349), new Color(0x397f25)));
        SignBtn.setFocusable(false);
        SignBtn.setFont(McButton);
        SignBtn.setForeground(Color.WHITE);

        // ? Adding
        base.add(LoginBtn);
        base.add(SignBtn);

        // TODO Functions

    }

    public JLayeredPane getPane() {
        return base;
    }

}
