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
public class Circle extends Shape{
    private double radius = 1.0;
    private final double PI = 3.14;
    private Point O;
    public Point getO() {
		return O;
	}
    public void setO(double x,double y) {
		this.O = new Point(x,y);
        }
    public Circle(){}
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double x,double y,double size,String color,String move,double radius){
        super(x,y,size,color,move);
        this.radius = radius;
    }
    
    public Circle(double x,double y){
        super(x,y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double a;
        a = (radius*radius)*PI;
        return a;
    }
    
    public double getPerimeter(){
        double p;
        p = 2 * PI * radius;
        return p;
    }
}
