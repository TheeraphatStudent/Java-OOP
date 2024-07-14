import javax.swing.JFrame;
import javax.swing.JButton;

// Layout
import java.awt.GridLayout;

public class FrameLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Buttons");

        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(5, 4));

        for(int i = 1; i <= 20; i++) {
            JButton button = new JButton("Button " + i);
            frame.add(button);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}