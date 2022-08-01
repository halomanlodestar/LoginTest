package framework.panes;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import framework.frame;

public class LoginPane extends frame {
    
    JLayeredPane loginPane = new JLayeredPane();

    public LoginPane() {

        // :: Properties
        loginPane.setBackground(new Color(0x123456));
        loginPane.setOpaque(true);

        // @ Labels
        JLabel Title = new JLabel("Login");
        Title.setFont(titleFont);
        Title.setForeground(Color.ORANGE);
        Title.setBounds(210, 15, 100, 150);

        JLabel usernameLabel = new JLabel("PASSWORD :");
        usernameLabel.setFont(baseFont);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setBounds(160, 115, 90, 80);

        JLabel passwordlLabel = new JLabel("EMAIL :");
        passwordlLabel.setFont(baseFont);
        passwordlLabel.setForeground(Color.WHITE);
        passwordlLabel.setBounds(125, 90, 90, 80);
        
        // @ Text Field
        JTextField _username = new JTextField();
        _username.setBounds(220, 120, 100, 20);
        _username.setFont(inputFont);

        JPasswordField _emai = new JPasswordField();
        _emai.setBounds(220, 145, 100, 20);
        _emai.setFont(inputFont);

        // @ Button
        JButton submit = new JButton("SUBMIT");
        submit.setFocusable(false);
        submit.setBounds(180, 210, 150, 30);
        submit.setFont(McButton);
        submit.setForeground(Color.WHITE);
        submit.setBackground(new Color(0x3b8526));
        submit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0x6bc349), new Color(0x397f25)));

        loginPane.add(submit);
        loginPane.add(Title);
        loginPane.add(usernameLabel);
        loginPane.add(passwordlLabel);
        loginPane.add(_emai);
        loginPane.add(_username);
    }

    public JLayeredPane getPane() {
        return loginPane;
    }

    public static void main(String[] args) {
        JFrame test = new JFrame();
        test.setLayout(null);
        JLayeredPane jp = new LoginPane().getPane();
        jp.setBounds(0, 0, 500, 350);
        test.add(jp);
        test.setSize(500, 350);
        test.setVisible(true);
        test.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
