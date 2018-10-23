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
public abstract class Shape {
    protected String move;
    protected String color;
    protected double x;
    protected double y;
    protected double size;
    public Shape(){}
    
    public Shape(double x,double y,double size,String color,String move){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        this.move = move;
    }
    
    public Shape(String color,String move){
        this.color = color;
        this.move = move;
    }
    
    public Shape(double x,double y){
        this.x = x;
        this.y = y;
    }
    
}
