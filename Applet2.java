
package javaapplication1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Er. Dhruvin Patel
 */
public class Applet2 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawLine(300, 100, 500, 200);
        g.drawLine(500, 100, 300, 200);
        g.drawRect(300, 100, 200, 100);
        g.drawOval(300, 100, 200, 100);
    }


}
