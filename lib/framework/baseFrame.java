package framework;

import java.awt.Color;
import javax.swing.*;
import framework.panes.basePane;

public class baseFrame extends frame {
    
    // :: root
    JFrame frame;
    
    public baseFrame() {
        frame = new JFrame("Login Revamp 31-07-22");
        frame.getContentPane().setBackground(new Color(0x123456));
        frame.setBounds(0, 0, 500, 350);
        frame.setSize(500, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        JLayeredPane basepane = new basePane().getPane();
        basepane.setBounds(0, 0, 500, 350);

        frame.add(basepane);
    }

}
