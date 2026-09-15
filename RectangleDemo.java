import java.awt.*;

class MyGraph extends Frame {

    MyGraph() {
        setTitle("Rectangle");
        setSize(500, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        
    g.drawOval(100, 100, 200, 200);
    g.fillOval(150, 150, 30, 30);    
    g.fillOval(220, 150, 30, 30);
    g.drawLine(200, 180, 200, 210);
    g.drawArc(140, 180, 120, 80, 200, 140);
    g.drawArc(140, 190, 120, 80, 200, 140);
    
    }
}   


class MyGraph2 extends Frame {

    MyGraph2() {
        setTitle("Rectangle");
        setSize(500, 400);
        setVisible(true);
    }

    public void paint(Graphics g) {
        
    g.drawRect(100, 100, 200, 200);
    g.fillOval(150, 150, 30, 30);    
    g.fillOval(220, 150, 30, 30);
    g.drawLine(200, 180, 200, 220);
    g.drawArc(140, 180, 120, 80, 200, 140);
    g.drawArc(140, 190, 120, 80, 200, 140);
    
    }
}   

public class RectangleDemo {

    public static void main(String[] args) {

        MyGraph obj = new MyGraph();
        MyGraph2 obj1 = new MyGraph2();

    }
}