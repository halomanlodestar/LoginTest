package framework;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import support.writedb;

public class Signup extends frame {

    public static void main(String[] args) {
        new Signup().dispose();
    }

    String otp;

    public Signup() {
        
        // @ SIGNUP
        frame signup = new frame();
        signup.setSize(500, 350);
        signup.getContentPane().setBackground(new Color(0x123456));
        signup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        signup.setAlwaysOnTop(true);

        // @ PANESSS

        // ? BASE PANE
        JLayeredPane Base = new JLayeredPane();
        Base.setBounds(0, 0, 500, 350);

        // ? OTP PANE
        JLayeredPane OTP = new JLayeredPane();
        OTP.setBounds(0, 0, 500, 350);
        OTP.setVisible(false);

        // ? Success Pane
        JLayeredPane Success = new JLayeredPane();
        Success.setBackground(Color.YELLOW);
        Success.setBounds(50, 35, 500, 350);
        Success.setVisible(false);

        // @ Button 
        JButton EXIT = new JButton("EXIT");
        EXIT.setFont(_font);
        EXIT.setBounds(155, 155, 95, 30);
        EXIT.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        EXIT.setFont(McButton);
        EXIT.setFocusable(false);
        EXIT.setBackground(new Color(0x3B8526));
        EXIT.setForeground(Color.WHITE);
        EXIT.addActionListener(e -> signup.dispose());

        JLabel Suc = new JLabel("REGISTERED!!!");
        Suc.setBounds(130, 35, 155, 40);
        Suc.setFont(subTitle);
        Suc.setForeground(Color.ORANGE);

        // @ Button
        JButton submitOTP = new JButton("SUBMIT");
        submitOTP.setFont(_font);
        submitOTP.setBounds(195, 210, 95, 30);
        submitOTP.setPressedIcon(ExitIcon);

        JButton back = new JButton("BACK");
        back.setFont(_backFont);
        back.setIcon(ExitIcon);
        back.setBounds(3, 7, 48, 16);
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(0x123456));
        back.setBorder(BorderFactory.createLineBorder(new Color(0x123456)));
        back.setFocusable(false);
        back.setIconTextGap(1);
        back.addActionListener(e -> {
            OTP.setVisible(false);
            Base.setVisible(true);
        });

        // @ Label
        JLabel OTPscrTitle = new JLabel("Enter OTP");     // ? Title
        OTPscrTitle.setBounds(185, 75, 125, 40);
        OTPscrTitle.setFont(subTitle);
        OTPscrTitle.setForeground(Color.ORANGE);

        JLabel invalid = new JLabel("-");     // ? Validity Status 
        invalid.setBounds(220, 100, 120, 25);

        // @ TextField
        JTextField _otp = new JTextField();
        _otp.setBounds(180, 120, 120, 25);
        _otp.setFont(_font);

        // @ Functions
        submitOTP.addActionListener(e -> {
                String _input = _otp.getText();
                System.out.println(otp);
                if (_input.isBlank()) {
                    System.out.println("blank");
                    invalid.setText("Blank");
                    invalid.setForeground(Color.BLACK);
                    invalid.setForeground(Color.black);
                }
                else if (_input.equalsIgnoreCase(otp)) {
                    System.out.println("Registered");
                    OTP.setVisible(false);
                    Success.setVisible(true);
                }
                else {
                    System.out.println("invalid");
                    invalid.setText("InValid");
                    invalid.setForeground(Color.RED);
                }
            }
        );

        // @ Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(205, 230, 95, 30);
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
                //ValidateOTP.validateOTP(mailString);
                OTP.setVisible(true);
                Base.setVisible(false);
                otp = support.HexKey.genKey();
                passString = "Yo cant heck :)";
                System.out.println(passString);
                System.out.println(otp);
            } catch (Exception ex) {
                System.out.println("An Error Occured : " + ex);
            }
        });

        // @ Adding

        // ? BASE
        signup.add(Success);
        signup.add(Base);
        signup.add(OTP);
        Base.add(_email);
        Base.add(_password);
        Base.add(submit);
        Base.add(email);
        Base.add(password);
        Base.add(Title);
        Base.add(_username);
        Base.add(username);

        // ? OTP
        OTP.add(submitOTP, JLayeredPane.DRAG_LAYER);
        OTP.add(OTPscrTitle);
        OTP.add(_otp);
        OTP.add(invalid);
        OTP.add(back);
        
        // ? SUCCESS
        Success.add(EXIT, JLayeredPane.DRAG_LAYER);
        Success.add(Suc);
    }
}
