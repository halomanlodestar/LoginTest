import java.awt.*;
import javax.swing.*;
import framework.frame;

public class App {

    static String key;

    // _ defines input 
    static Font titleFont = new Font("Minecraft Ten", 1, 30);
    static Font subTitle = new Font("Minecraft Ten", 1, 22);
    static Font baseFont = new Font("Mojang", 1, 13);
    static Font censored = new Font("Segoe MDL2 Assets", 1, 13);
    static Font _font = new Font("Mojang", 0, 12);

    // |> Main 
    public static void main(String[] args) throws Exception {

        // @ Base
        frame fw = new frame("Main");
        fw.setSize(500, 350);
        fw.getContentPane().setBackground(new Color(0x123456));
        fw.setVisible(true);
        fw.setResizable(false);
        
        // @ Buttons
        JButton submit = new JButton("Submit");
        submit.setBounds(205, 230, 95, 30);
        submit.setFont(_font);

        // @ TextField
        JTextField _email = new JTextField();     // ? email Field
        _email.setBounds(215, 120, 130, 25);
        _email.setFont(_font);

        JTextField _password = new JTextField();     // ? Password Field
        _password.setBounds(215, 155, 130, 25);
        _password.setFont(censored);

        // @ Label
        JLabel email = new JLabel("EMAIL :"); // ? email Label
        email.setForeground(Color.WHITE);
        email.setBounds(153, 120, 140, 25);
        email.setFont(baseFont);

        JLabel password = new JLabel("PASSWORD :"); // ? Password Label
        password.setForeground(Color.WHITE);
        password.setBounds(120, 155, 140, 25);
        password.setFont(baseFont);

        JLabel Title = new JLabel("LOGIN"); // ? Title
        Title.setForeground(Color.ORANGE);
        Title.setBounds(205, 50, 130, 30);
        Title.setFont(titleFont);

        // @ Functions
        submit.addActionListener(e -> validateOTP(email.getText()));

        // @ Adding
        fw.add(_email);
        fw.add(_password);
        fw.add(submit);
        fw.add(email);
        fw.add(password);
        fw.add(Title);

    }

    private static void validateOTP(String s) {

        String otp = support.HexKey.genKey();
        System.out.println(otp);
        frame otpvalid = new frame("OTP VALIDATION");
        otpvalid.setResizable(false);
        otpvalid.setLayout(null);
        otpvalid.setVisible(true);
        otpvalid.setSize(400, 250);
        otpvalid.getContentPane().setBackground(new Color(0x123456));

        // @ Button
        JButton submitOTP = new JButton("SUBMIT");
        submitOTP.setFont(_font);
        submitOTP.setBounds(155, 155, 95, 30);
        

        // @ Label
        JLabel OTPscrTitle = new JLabel("Enter OTP");     // ? Title
        OTPscrTitle.setBounds(145, 35, 125, 40);
        OTPscrTitle.setFont(subTitle);
        OTPscrTitle.setForeground(Color.ORANGE);

        JLabel invalid = new JLabel(" HI ");     // ? Validity Status 
        invalid.setBounds(190, 100, 120, 25);

        // @ TextField
        JTextField _otp = new JTextField();
        _otp.setBounds(140, 80, 120, 25);
        _otp.setFont(censored);

        // @ Adding
        otpvalid.add(submitOTP);
        otpvalid.add(OTPscrTitle);
        otpvalid.add(_otp);
        otpvalid.add(invalid);
        

        // @ Functions
        submitOTP.addActionListener(e -> {
                String _input = _otp.getText();
                if (_input.isBlank()) {
                    System.out.println("blank");
                    invalid.setText("Blank");
                    invalid.setForeground(Color.black);
                }
                else if (_input.equalsIgnoreCase(otp)) {
                    System.out.println("Valid");
                    invalid.setText("Valid");
                    invalid.setForeground(Color.GREEN);
                }
                else {
                    System.out.println("invalid");
                    invalid.setText("InValid");
                    invalid.setForeground(Color.RED);
                }
            }
        );
    }
}