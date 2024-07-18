package components;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;

public class Footer {
    public Footer(Color getColor) {
        this.bgColor = getColor.brighter();

    }

    private Color bgColor = new Color(0);
    private JPanel panel = new JPanel(new GridLayout(1, 3, 20, 20));

    public JPanel getFooter() {
        panel.setBackground(bgColor);

        JButton btn = new JButton("Hello World");
        JButton btn2 = new JButton("Hello Human");
        JButton btn3 = new JButton("Hello Cat");
        panel.add(btn);
        panel.add(btn2);
        panel.add(btn3);

        return this.panel;

    }
}
