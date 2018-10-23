/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

/**
 *
 * @author user56
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    
    public Rectangle(){}
    
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(Point x,Point y,Point z,Point t){
        this.point1 = x;
        this.point2 = y;
        this.point3 = z;
        this.point4 = t;
        
    }
     public void getPoint(Point x,Point y,Point z,Point t){
        this.point1 = x;
        this.point2 = y;
        this.point3 = z;
        this.point4 = t;
        
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double getArea(){
        double a;
        a = width * length;
        return a;
    }
    
    public double getPerimeter(){
        double p;
        p = (width + length) * 2;
        return p;
    }
    
}
