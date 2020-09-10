import com.sun.webkit.ColorChooser;

import java.awt.*;
import java.applet.*;

public class variabelen extends Applet {
    Color FillColor;
    Color LineColor;
    int width;
    int height;

    public void init() {
        Color FillColor = Color.MAGENTA;
        Color LineColor = Color.BLACK;
        width = 200;
        height = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",90,25);

        g.drawRect(10,30,200,75);
        g.drawString("Rechthoek",75,120);

        g.drawRoundRect(10,150,200,75,20,20);
        g.drawString("Afgeronde Rechthoek",50,240);

        g.setColor(Color.magenta);
        g.fillRect(224,30,200,75);
        g.drawRect(224,30,200,75);
        g.setColor(Color.black);
        g.drawOval(224,30,200,75);
        g.drawString("Gevulde Rechthoek met Ovaal",240,120);

        g.setColor(Color.magenta);
        g.fillOval(224,150,200,75);
        g.drawOval(224,150,200,75);
        g.setColor(Color.black);
        g.drawString("Gevulde Ovaal",280,240);

        g.drawArc(450,20,200,100,0,360);
        g.setColor(Color.magenta);
        g.fillArc(450,20,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",470,145);

        g.drawArc(500,170,100,100,0,360);
        g.drawString("Circkel",530,290);
    }
}