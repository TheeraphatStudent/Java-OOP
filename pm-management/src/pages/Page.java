package pages;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

import components.Dashboard;
import components.Statistic;
import components.Footer;

public class Page {
    JFrame frame = new JFrame("PM2.5 Reporter");
    JPanel panel = new JPanel(new GridLayout(1, 2, 20, 20));

    Color primary_color = new Color(248, 237, 227, 70).darker();

    Dashboard dashboard = new Dashboard();
    Footer footer = new Footer(primary_color);
    Statistic statistic = new Statistic();

    public void showFrame() {
        frame.setSize(500, 500);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gridConst = new GridBagConstraints();

        frame.getContentPane().setBackground(primary_color);

        // Panel Content
        panel.setBackground(primary_color);
        panel.add(dashboard.getDashboard());
        panel.add(statistic.getStatistic());

        // Main Content
        gridConst.gridx = 0;
        gridConst.gridy = 0;
        gridConst.weightx = 1.0;
        gridConst.weighty = 0.7;
        gridConst.fill = GridBagConstraints.BOTH;
        gridConst.insets = new Insets(20, 20, 20, 20);
        frame.add(panel, gridConst);

        gridConst.gridx = 0;
        gridConst.gridy = 1;
        gridConst.weightx = 1.0;
        gridConst.weighty = 0.3;
        gridConst.fill = GridBagConstraints.BOTH;
        gridConst.insets = new Insets(0, 20, 20, 20);
        frame.add(footer.getFooter(), gridConst);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
