import java.awt.GridLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextareaEditor {
    public static void main(String[] args) {
        Frame frame = new Frame("My Textarea");
        JTextArea textarea = new JTextArea();

        frame.setSize(500, 500);
        frame.setLayout(null);

        int textareaWidth = (int) (frame.getWidth() / 1.5);
        int textareaHeight = (int) (frame.getHeight() / 1.5);

        int x = (frame.getWidth() - textareaWidth) / 2;
        int y = (frame.getHeight() - textareaHeight - 200) / 2;

        textarea.setBounds(x, y, textareaWidth, textareaHeight);

        // Button Panel
        JPanel panel = new JPanel(new GridLayout(1, 3, 5, 0));
        panel.add(getButton("Open File", textareaWidth));
        panel.add(getButton("Save File", textareaWidth));
        panel.add(getButton("Clear Screen", textareaWidth));

        int panelY = y + textareaHeight + 20;
        panel.setBounds(x, panelY, textareaWidth, 30);

        frame.add(textarea);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static JButton getButton(String title, int getChildWidth) {
        JButton button = new JButton(title);

        return button;
    }
}
