
package javaapplication1;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Er. Dhruvin Patel
 */
public class Applet1 extends Applet {

    public void init() {
        System.out.println("Init");
    }
    
        public void start() {
            System.out.println("Start");
    }  
        
        public void paint(Graphics g) {
            System.out.println("Paint");
            g.drawString("Dhruvin Patel",100,100);
    } 
        
        public void stop() {
            System.out.println("Stop"); 
    }
        
    public void destroy() {
        System.out.println("destroy");
    }
        

    // TODO overwrite start(), stop() and destroy() methods
}
