package framework;

import javax.swing.*;
import java.awt.*;

public class ValidateOTP extends frame {

    public ValidateOTP(String string) {
    }

    public static void validateOTP(String s) {

        // :: Mail (Pending!!)

        String otp = support.HexKey.genKey();
        System.out.println(otp);
        frame otpvalid = new frame();
        otpvalid.setTitle("Validate OTP");
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

        JLabel invalid = new JLabel("-");     // ? Validity Status 
        invalid.setBounds(190, 100, 120, 25);

        // @ TextField
        JTextField _otp = new JTextField();
        _otp.setBounds(140, 80, 120, 25);
        _otp.setFont(_font);

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
                    invalid.setForeground(Color.BLACK);
                    invalid.setForeground(Color.black);
                }
                else if (_input.equalsIgnoreCase(otp)) {
                    System.out.println("Registered");
                    invalid.setText("Registered");
                    invalid.setForeground(Color.GREEN);
                    otpvalid.dispose();
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
