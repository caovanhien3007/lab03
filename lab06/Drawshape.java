/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
//import static java.awt.Color.white;
import java.awt.*;
import static javafx.scene.paint.Color.color;
import javax.swing.JFrame;

/**
 *
 * @author user56
 */
class Drawshape extends JFrame {
    private int framewidth =700, frameHeight =500;
    public Drawshape(){
        setBounds(100,100,framewidth,frameHeight);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g)
    {
        
        g.setColor(Color.white);
        g.fillRect(0,0,framewidth, frameHeight);
        g.setColor(Color.red);
        g.fillRect(400,100,100,50);
        g.setColor(Color.YELLOW);
       // g.fillPolygon(30, 40, 50)int[];
      // g.drawPolygon(new int[] {0, 50, 100}, new int[] {200, 70, 200}, 3);
        //g.drawPolygon((new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
        g.fillPolygon(new int[] {10, 90, 170}, new int[] {200, 70, 200}, 3);
        g.fillOval(200, 200, 150, 150);
    }
    public static void main(String []arg)
{
    Drawshape b =new Drawshape();
   // b.paint();
}
}
