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
public class Triangle extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;
    
    public Triangle(){}
    
    public Triangle(double x,double y,double size,String color,String move){
         super(x,y,size,color,move);
    }
    
    public Triangle(Point point1,Point point2,Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    
}
