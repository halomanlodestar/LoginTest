package framework;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import support.writedb;

public class Signup extends frame {

    public Signup() {

        // :: OTP PANE 

        JLayeredPane OTP = new JLayeredPane();
        OTP.setBackground(new Color(0xff00ff));
        OTP.setBounds(0, 0, 500, 350);

        frame signup = new frame();
        signup.setSize(500, 350);
        signup.getContentPane().setBackground(new Color(0x123456));
        signup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signup.setAlwaysOnTop(true);

        // @ Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(205, 230, 95, 30);
        submit.setFont(_font);
        submit.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        submit.setFont(McButton);
        submit.setFocusable(false);
        submit.setBackground(new Color(0x3B8526));
        submit.setForeground(Color.WHITE);

        // @ TextField
        JTextField _email = new JTextField();     // ? email Field
        _email.setBounds(215, 110, 130, 25);
        _email.setFont(_font);

        JPasswordField _password = new JPasswordField();     // ? Password Field
        _password.setBounds(215, 140, 130, 25);
        _password.setFont(_font);

        JTextField _username = new JTextField();
        _username.setBounds(215, 170, 130, 25);
        _username.setFont(_font);

        // @ Label
        JLabel email = new JLabel("EMAIL :"); // ? email Label
        email.setForeground(Color.WHITE);
        email.setBounds(153, 110, 140, 25);
        email.setFont(baseFont);

        JLabel password = new JLabel("PASSWORD :"); // ? Password Label
        password.setForeground(Color.WHITE);
        password.setBounds(120, 140, 140, 25);
        password.setFont(baseFont);

        JLabel username = new JLabel("USERNAME : ");
        username.setBounds(120, 170, 140, 25);
        username.setFont(baseFont);
        username.setForeground(Color.WHITE);

        JLabel Title = new JLabel("SIGN UP"); // ? Title
        Title.setForeground(Color.ORANGE);
        Title.setBounds(205, 50, 130, 30);
        Title.setFont(titleFont);

        // @ Functions
        submit.addActionListener(e -> {
            String mailString = _email.getText();
            String passString = new String(_password.getPassword());
            String usernameString = _username.getText();

            try {
                writedb.writeData(mailString, passString, usernameString);
                ValidateOTP.validateOTP(mailString);
                passString = "Yo cant heck :)";
                System.out.println(passString);
            } catch (Exception ex) {
                System.out.println("An Error Occured : " + ex);
            }
        });

        // @ Adding
        signup.add(OTP);
        signup.add(_email);
        signup.add(_password);
        signup.add(submit);
        signup.add(email);
        signup.add(password);
        signup.add(Title);
        signup.add(_username);
        signup.add(username);
    }
}
