import javax.swing.JRadioButton;

import framework.frame;

public class test extends frame {
    public static void main(String[] args) {

        frame f = new frame();
        f.setSize(200, 200);
        JRadioButton r = new JRadioButton();
        //r.setIcon(ExitIcon);
        f.add(r);
        r.setBounds(0, 0, 20, 20);
    }
}
