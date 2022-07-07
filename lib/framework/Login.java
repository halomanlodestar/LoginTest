package framework;

import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.*;
import support.DB2code;
import javax.swing.border.*;

public class Login extends frame {

        public Login() {

        // @ Base
        frame fw = new frame();
        fw.setTitle("Login");
        fw.setSize(500, 350);
        fw.getContentPane().setBackground(new Color(0x123456));
        fw.setResizable(false);
        fw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fw.isAlwaysOnTopSupported();
        
        // @ Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(205, 230, 95, 30);
        submit.setFont(_font);
        //submit.setBorder(BorderFactory.createEtchedBorder());
        submit.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        submit.setFont(McButton);
        submit.setFocusable(false);
        submit.setBackground(new Color(0x3B8526));
        submit.setForeground(Color.WHITE);

        // @ TextField
        JTextField _email = new JTextField();     // ? email Field
        _email.setBounds(215, 120, 130, 25);
        _email.setFont(_font);

        JPasswordField _password = new JPasswordField();     // ? Password Field
        _password.setBounds(215, 155, 130, 25);
        _password.setFont(_font);

        // @ Label
        JLabel email = new JLabel("EMAIL :"); // ? email Label
        email.setForeground(Color.WHITE);
        email.setBounds(153, 120, 140, 25);
        email.setFont(baseFont);

        JLabel password = new JLabel("PASSWORD :"); // ? Password Label
        password.setForeground(Color.WHITE);
        password.setBounds(120, 155, 140, 25);
        password.setFont(baseFont);

        JLabel invalid = new JLabel("-");     // ? Validity Status 
        invalid.setBounds(210, 175, 120, 25);

        JLabel Title = new JLabel("LOGIN"); // ? Title
        Title.setForeground(Color.ORANGE);
        Title.setBounds(205, 50, 130, 30);
        Title.setFont(titleFont);

        // @ Functions
        submit.addActionListener(e -> {
            String mailString = _email.getText();
            String passString = new String(_password.getPassword()); 

            DB2code Code;
            try {
                Code = new DB2code();
                boolean bm = Code.getMail().equals(mailString) || Code.getUsername().equals(mailString);
                boolean bp = Code.getPass().equals(passString);

                if (bm && bp) {
                    System.out.println("welcome");
                    fw.dispose();
                }
                else if (!bm) {
                    System.out.println("Invalid Email");
                    invalid.setText("Invalid Email");
                    invalid.setForeground(Color.RED);
                }
                else if (!bp) {
                    System.out.println("Invalid Password");
                    invalid.setText("Invalid Password");
                    invalid.setForeground(Color.RED);
                }
                
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        });

        // @ Adding
        fw.add(_email);
        fw.add(_password);
        fw.add(submit);
        fw.add(email);
        fw.add(password);
        fw.add(Title);
        fw.add(invalid);
    }
}