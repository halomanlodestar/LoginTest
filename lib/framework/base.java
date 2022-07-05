package framework;

import java.awt.*;
import javax.swing.*;

public class base extends frame {

    public base() {
        frame Base = new frame();
        Base.setTitle("Launcher Snapshot : 1");
        Base.setSize(500, 350);
        Base.getContentPane().setBackground(new Color(0x123456));
        Base.setResizable(false);

        // @ Buttons
        JButton Login = new JButton("Login");
        Login.setBackground(Color.GREEN);
        Login.setBounds(170, 135, 170, 30);
        Login.setFont(McButton);
        Login.setForeground(Color.LIGHT_GRAY);
        
        // :: Function
        Login.addActionListener(e -> {
            Login l = new Login();
            l.dispose();
            });

        JButton SignUp = new JButton("Sign Up");
        SignUp.setBackground(Color.GREEN);
        SignUp.setBounds(170, 170, 170, 30);
        SignUp.setFont(McButton);
        SignUp.setForeground(Color.LIGHT_GRAY);  

        // :: Function
        SignUp.addActionListener(e -> {
            Signup s = new Signup();
            s.dispose();
            });

        // @ Adding
        Base.add(Login);
        Base.add(SignUp);
    }
}