import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World!!!");
        JTextField field = new JTextField();
        JButton btn = new JButton("OK");

        frame.setLayout(new GridLayout(2, 1));
        frame.setSize(400, 100);

        // btn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         field.setText("Hello World");

        //     }
        // });
        btn.addActionListener((e -> {
            // System.out.println(e.getActionCommand());
            field.setText("Hello World");
        }));

        frame.add(field);
        frame.add(btn);

        frame.setVisible(true);
    }

}