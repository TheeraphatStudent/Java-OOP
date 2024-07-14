import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.Random;

public class RandomButton {
    public static void main(String[] args) {
        RandomButton useFunc = new RandomButton();

        JFrame frame = new JFrame("Multiple Buttons");

        frame.setSize(500, 500);
        frame.setLayout(null);

        Random random = new Random();
        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();

        int i = 50;
        for(int j = 1; j <= i; j++) {
            JButton button = new JButton("" + j);

            int x = random.nextInt(frameWidth - 100);
            int y = random.nextInt(frameHeight - 100);

            // Set Color
            button.setBackground(useFunc.getRandomColor());

            button.setBounds(x, y, 50, 30);
            frame.add(button);
        }

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    private Color getRandomColor() {
        Random rand = new Random();
        // int r = rand.nextInt(0, 255);
        int r = rand.nextInt(0, 255);
        int g = rand.nextInt(0, 255);
        int b = rand.nextInt(0, 255);

        System.out.printf("R %d G %d B %d", r, g, b);

        return Color.getHSBColor(r, g, b);

    }
}
