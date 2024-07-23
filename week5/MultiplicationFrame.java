import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MultiplicationFrame extends JFrame {
    public MultiplicationFrame() {
        setTitle("Multiplication Table");
        setLayout(new GridBagLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MultiplicationFrame frame = new MultiplicationFrame();
        JButton btn = new JButton("OK");
        JTextField field = new JTextField();
        JTextArea textarea = new JTextArea(13, 1);

        btn.addActionListener(e -> {
            textarea.setText(new MultiplicationFrame().multiplication(field.getText()));
        });

        GridBagConstraints gridConst = new GridBagConstraints();

        gridConst.gridy = 0;
        gridConst.weightx = 1;
        gridConst.weighty = 0.1;
        gridConst.fill = GridBagConstraints.BOTH;
        frame.add(field, gridConst);

        gridConst.gridy = 1;
        gridConst.weightx = 1;
        gridConst.weighty = 0.8;
        gridConst.fill = GridBagConstraints.BOTH;
        frame.add(textarea, gridConst);

        gridConst.gridy = 2;
        gridConst.weightx = 1;
        gridConst.weighty = 0.1;
        gridConst.fill = GridBagConstraints.BOTH;
        frame.add(btn, gridConst);

        frame.setVisible(true);
    }

    public String multiplication(String number) {
        String result = "";
        try {
            int multiply = Integer.parseInt(number);
            for (int i = 1; i <= 12; i++) {
                result += i + " x " + multiply + " = " + (i * multiply) + "\n";
            }
        } catch (NumberFormatException e) {
            result = "Input Number Error!!!";
        }
        return result;
    }
}
