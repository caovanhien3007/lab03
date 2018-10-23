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
public class Square extends Rectangle{
    public Square(){}
    
    
    public Square(double side){
        super(side,side);
    }
    
     public Square(Point x,Point y,Point z,Point t){
         super(x,y,z,t);
     }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
