/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author user56
 */
public class Lab06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape ajn;
       //ajn.color ="ghgjg";
       
       Rectangle a= new Rectangle(1,7);
       ajn =a;
       Rectangle b=(Rectangle) ajn;
      
        System.out.println(b.getLength());
    }
     public void paint()
    {
        Graphics g = null ;
       // g.setColor(Color.white);
       // g.fillRect(0,0,700, 600);
        g.setColor(Color.red);
        g.fillRect(400,100,50,50);
        g.setColor(Color.YELLOW);
       // g.fillPolygon(30, 40, 50)int[];
      // g.drawPolygon(new int[] {0, 50, 100}, new int[] {200, 70, 200}, 3);
        //g.drawPolygon((new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
        g.fillPolygon(new int[] {0, 50, 100}, new int[] {200, 70, 200}, 3);
        g.fillOval(200, 200, 300, 300);
    }
    
}
