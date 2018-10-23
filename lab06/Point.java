/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06;

import static java.lang.Math.pow;

/**
 *
 * @author user56
 */
class Point {
    private double x;
    private double y;
    
    public Point(){
        
    }
    
    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }
    public  double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double khoangCach(Point point){
        double kc = pow((pow((point.y-this.y),2) + pow((point.x - this.x),2)),0.5);
        return kc;
    }
    
}
