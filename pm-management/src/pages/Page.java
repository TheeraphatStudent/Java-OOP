package pages;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;

public class Page {
    JFrame frame = new JFrame("PM2.5 Reporter");

    public void showFrame() {
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(20, 10, 5, 5));

        JButton getFile = new JButton("Seclect File");

        frame.add(getFile);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

    }
}
