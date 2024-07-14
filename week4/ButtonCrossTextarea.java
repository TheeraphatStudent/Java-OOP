import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
// Layout
import java.awt.GridLayout;

public class ButtonCrossTextarea {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Buttons");

        frame.setSize(500, 500);
        // frame.setLayout(new GridLayout(0, 5));
        frame.setLayout(new GridLayout(8, 5));
        // frame.setLayout(new FlowLayout());

        for(int i = 1; i <= 20; i++) {
            JButton button = new JButton("Button " + i);
            JTextArea textarea = new JTextArea();
            frame.add(button);
            frame.add(textarea);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}