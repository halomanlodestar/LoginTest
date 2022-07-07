package framework;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class base extends frame {

    public base() {
        frame Base = new frame();
        Base.setTitle("Launcher Snapshot : 1");
        Base.setSize(500, 350);
        Base.getContentPane().setBackground(new Color(0x123456));
        Base.setResizable(false);

        // @ Buttons
        JButton Login = new JButton("Login");
        Login.setBackground(new Color(0x3B8526));
        Login.setBounds(170, 165, 170, 30);
        Login.setFont(McButton);
        Login.setForeground(Color.WHITE);
        Login.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED/*, new Color(0x47992C), new Color(0x3A7F24*/));
        Login.setFocusable(false);


        // @ Labels
        JLabel background = new JLabel();
        background.setIcon(StoneImg);
        background.setBounds(0, 0, 500, 350);
        
        // :: Function
        Login.addActionListener(e -> {
            Login l = new Login();
            l.dispose();
            });

        JButton SignUp = new JButton("Sign Up");
        SignUp.setBackground(new Color(0x3B8526));
        SignUp.setBounds(170, 205, 170, 30);
        SignUp.setFont(McButton);
        SignUp.setForeground(Color.WHITE);
        SignUp.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        Signup.isDefaultLookAndFeelDecorated();
        SignUp.setFocusable(false);

        // :: Function
        SignUp.addActionListener(e -> {
            Signup s = new Signup();
            s.dispose();
            });

        // @ Adding
        Base.add(Login);
        Base.add(SignUp);
        //Base.add(background);
    }
}