package JavaCourse_Section_11_AccessModifiers.com.example.awtSample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class myWindow extends Frame {

    public myWindow(String title){
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SanSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SanSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The complete java developer course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("By MK",60, 100);

    }
}
