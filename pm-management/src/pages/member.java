package pages;

import javax.swing.JFrame;

import resource.environment.WindowClosingFrameEvent;
import resource.environment.WindowEntryScreen;

public class Member extends JFrame {
    public Member() {
        setTitle("Developer Member");
        setSize(500, 500);
        setLocation(new WindowEntryScreen().getWidthCenter(), new WindowEntryScreen().getHeightCenter());

        new WindowClosingFrameEvent(this, new EntryPage());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
