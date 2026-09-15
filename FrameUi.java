import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.graphics.*;


public class FrameUi
{
    public static void main(String[] s)
    {
        JFrame frame = new JFrame("Gui With Buttons");
        JButton b1 = new JButton("OK");
        JButton b2 = new JButton("CANCEL");


        frame.setLayout(new FlowLayout());
        
         public void paint(Graphics g) {
        g.drawRect(100, 100, 250, 150);
    }
     

        frame.setSize(800, 600);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}