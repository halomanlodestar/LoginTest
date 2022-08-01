package framework.panes;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import framework.frame;
import java.awt.*;

public class SignUpPane extends frame {

    JLayeredPane signupPane = new JLayeredPane();

    public SignUpPane() {
        
        // :: Properties
        signupPane.setBackground(new Color(0x123456));
        signupPane.setOpaque(true);

        // @ Labels
        JLabel Title = new JLabel("signup");
        Title.setFont(titleFont);
        Title.setForeground(Color.ORANGE);
        Title.setBounds(200, 15, 150, 150);

        JLabel usernameLabel = new JLabel("USERNAME :");
        usernameLabel.setFont(baseFont);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(125, 90, 90, 80);

        JLabel emailLabel = new JLabel("EMAIL :");
        emailLabel.setFont(baseFont);
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(160, 115, 90, 80);

        JLabel passwordLabel = new JLabel("PASSWORD :");
        passwordLabel.setFont(baseFont);
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setBounds(127, 140, 90, 80);

        // @ Text Field
        JTextField _username = new JTextField();
        _username.setBounds(220, 120, 100, 20);
        _username.setFont(inputFont);

        JTextField _email = new JTextField();
        _email.setBounds(220, 145, 100, 20);
        _email.setFont(inputFont);

        JTextField _password = new JTextField();
        _password.setBounds(220, 170, 100, 20);
        _password.setFont(inputFont);

        // @ Button
        JButton submit = new JButton("SUBMIT");
        submit.setFocusable(false);
        submit.setBounds(180, 210, 150, 30);
        submit.setFont(McButton);
        submit.setForeground(Color.WHITE);
        submit.setBackground(new Color(0x3b8526));
        submit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0x6bc349), new Color(0x397f25)));

        signupPane.add(Title);
        signupPane.add(usernameLabel);
        signupPane.add(emailLabel);
        signupPane.add(passwordLabel);
        signupPane.add(_username);
        signupPane.add(_email);
        signupPane.add(_password);
        signupPane.add(submit);
    }

    public JLayeredPane getPane() {
        return signupPane;
    }

    public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setLayout(null);
        JLayeredPane jp = new SignUpPane().getPane();
        jp.setBounds(0, 0, 500, 350);
        test.add(jp);
        test.setSize(500, 350);
        test.setVisible(true);
        test.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
